//(uploadify3.2)
function UploadifyManager(upId) {
    var obj = new Object();

    var _uploadifyAuto = true; //是否自动上传
    var _uploadifyPath = "/Scripts/UIpackage/jquery.uploadify.3.2/"; //插件目录
    var _uploadAttachExts = "*.jpg;*.jpeg;*.gif;*.png;";  //允许附件类型
    var _uplaodAttachSizeLimit = "4MB";   //允许附件大小(MB） The maximum size of an uploadable file in KB (Accepts units B KB MB GB if string, 0 for no limit)
    var _uploadAttachDesc = "请选择文件格式:" + _uploadAttachExts;
    var _btnUploadPic = "/Scripts/UIpackage/jquery.uploadify.3.2/btnUpload.gif"; //选择附件按钮图片
    var _queueID = "null"; //如果空字符串，默认有进度条
    var _AttachmentType = 999;//附件归属子文件夹

    //初始化参数
    obj.InitArgs = function (args) {
        if (typeof args.uploadifyAuto != 'undefined') {
            _uploadifyAuto = args.uploadifyAuto;
        }
        if (typeof args.uploadAttachExts != 'undefined') {
            _uploadAttachExts = args.uploadAttachExts;
        }
        if (typeof args.uplaodAttachSizeLimit != 'undefined') {
            _uplaodAttachSizeLimit = args.uplaodAttachSizeLimit;
        }
        if (typeof args.btnUploadPic != 'undefined') {
            _btnUploadPic = args.btnUploadPic;
        }
        if (typeof args.queueID != 'undefined') {
            _queueID = args.queueID;
        }
        if (typeof args.attachmentType != 'undefined') {
            _AttachmentType = args.attachmentType;
        }
        _uploadAttachDesc = "请选择文件格式:" + _uploadAttachExts;
    };

    //初始化上传
    obj.InitUploadify = function (args) {
        $("#" + args.fileId).uploadify({
            'buttonImage': _btnUploadPic,
            'buttonCursor': 'hand',
            'width': 73,
            'height': 19,
            'cancelImage': _uploadifyPath + 'uploadify-cancel.png',
            'auto': _uploadifyAuto,
            'successTimeout': 99999,
            'swf': _uploadifyPath + 'uploadify.swf?rand=' + Math.random(),
            'queueID': _queueID,
            'uploader': '/Rest/UploadFile/Upload',
            'fileSizeLimit': _uplaodAttachSizeLimit,
            'fileTypeExts': _uploadAttachExts,
            'multi': true,
            "method": "POST",
            'queueSizeLimit': 2,
            'progressData': 'speed',
            'overrideEvents': ['onDialogClose'],
            'formData': { 'fileExt': _uploadAttachExts, 'sizeLimit': _uplaodAttachSizeLimit, 'AttachmentType': _AttachmentType }, //这里只能传静态参数    
            'onInit': function (instance) {
                $("#attachUploadQueue").remove();


            },
            'onSelectError': function (file, errorCode, errorMsg) {
                var err = "";
                switch (errorCode) {
                    case -100:
                        err = "上传的文件数量已经超出系统限制的" + $("#" + args.fileId).uploadify('settings', 'queueSizeLimit') + "个文件！";
                        break;
                    case -110:
                        err = "文件 [" + file.name + "] 大小超出系统限制的" + $("#" + args.fileId).uploadify('settings', 'fileSizeLimit') + "大小！";
                        break;
                    case -120:
                        err = "文件 [" + file.name + "] 大小异常！";
                        break;
                    case -130:
                        err = "文件 [" + file.name + "] 类型不正确！";
                        break;
                }
                alert(err);
            },
            'onClearQueue': function (queueItemCount) {
                alert("取消上传");
                return;
            },
            'onQueueComplete': function (queueData) {
                $("#attachUploadQueue").remove();
            },
            //上传失败
            'onUploadError': function (file, errorCode, errorMsg, errorString) {
                //alert('The file ' + file.name + ' could not be uploaded: ' + errorString);
            },
            'onUploadProgress': function (file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
                //$('#progress').html(totalBytesUploaded + ' bytes uploaded of ' + totalBytesTotal + ' bytes.');
            },
            //
            'onUploadStart': function (file) {
                //在onUploadStart事件中，也就是上传之前，把参数写好传递到后台。   
            },
            //上传成功
            'onUploadSuccess': function (file, data, response) {
                try {
                    
                    var rs = eval('(' + data + ')');
                    if (rs.Success) {
                        if (args.successCallFunc != undefined) {
                            //返回原始文件名，文件相对路径
                            args.successCallFunc({ relativeUrl: rs.RelativeUrl, filename: rs.SrcFileName, uploadTime: rs.UploadTime,fileSize:rs.FileSize });
                        }
                    } else {
                        //openError("错误提示", rs.error, null);
                        alert(rs.error);
                    }
                } catch (err) {
                    alert(err);
                }
            }
        });
    };

    return obj;
}