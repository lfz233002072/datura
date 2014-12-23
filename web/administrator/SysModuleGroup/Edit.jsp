<%-- 
    Document   : modulegourp
    Created on : 2014-11-15, 15:56:13
    Author     : lfz
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../header.jsp" %>

    <form name="Form1" method="post"
          action="Set.aspx" id="Form1" >
       
        <div class="main_form" style="margin: 10px auto;padding-right: 40px;">
            <div class="divHeader">
                <div class="title">
                    塔式起重机监控登记</div>
                <div style="width: 100%; background: #555555; height: 2px; margin-left: auto; margin-right: auto;">
                </div>
                <div style="width: 100%; background: white; height: 1px; margin-left: auto; margin-right: auto;">
                </div>
                <div style="width: 100%; background: gray; height: 1px; margin-left: auto; margin-right: auto;">
                </div>
            </div>
            <p>
                <label class="label">
                    产权备案号:</label>
                <input name="txtFilingNO" type="text" id="txtFilingNO" class="lineinput easyui-validatebox validatebox-text" delay="999999999" invalidmessage="该备案编号已存在" onblur="validate(this);" value="滇池会展5号" validtype="remote['/App_Ajax/MonitorRegister.ashx?PostType=IsFilingNOExist&amp;OldFilingNO=%u6EC7%u6C60%u4F1A%u5C555%u53F7','FilingNO']">
                <label class="label">
                    工地编号:</label>
                <input name="txtDeviceNO" type="text" id="txtDeviceNO" class="lineinput easyui-validatebox validatebox-text" required="true" value="1">
            </p>
            <p>
                <label class="label">
                    塔机出厂日期:</label>
                <input name="txtManufactureDate" type="text" id="txtManufactureDate" class="lineinput" readonly="readonly">
                <input type="button" class="dateinput icon-date" onclick="WdatePicker({el: 'txtManufactureDate'})">
                <label class="label">
                    塔机型号:</label>
                <input name="txtSpecModel" type="text" id="txtSpecModel" class="lineinput" value="5512">
            </p>
            <p>
                <label class="label">
                    是否监控:</label>
                <select id="ddlIsMonitor" class="easyui-combobox combobox-f combo-f" style="width: 170px; display: none;" data-options="panelHeight:'auto',editable:false" comboname="ddlIsMonitor">
                    <option value="0">关闭监控</option>
                    <option selected="selected" value="1">打开监控</option>
                </select><span class="combo" style="width: 168px; height: 20px;"><input type="text" class="combo-text validatebox-text" autocomplete="off" readonly="readonly" style="width: 140px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="height: 22px;"></span></span><input type="hidden" class="combo-value" name="ddlIsMonitor" value="1"></span>
            </p>
            <p>
                <label class="label">
                    塔机生产厂商:</label>
                <input type="text" id="txtManufactureCompanyName" class="lineinput combogridExt long combogrid-f combo-f" requesturl="/App_Ajax/Company.ashx?PostType=GetCompanyList&amp;CompanyType=ManufactureCompany" validtype="sameText['#txtManufactureCompanyName','#btnAddManufactureCompany','该单位不存在，请重新选择或新增']" data-options="
                       textField: 'CompanyName',
                       idField: 'CompanyID',
                       columns: [[
                       { field: 'CompanyName', title: '单位名称', width: 246 },
                       { field: 'Address', title: '单位地址', width: 200 }
                       ]]" value="广西建机有限公司" hiddenid="def2449a-ce67-e311-85b8-7845c4ecc6e2" oldtext="广西建机有限公司" selectedtext="广西建机有限公司" comboname="txtManufactureCompanyName" style="display: none;"><span class="combo" style="width: 452px;"><input type="text" class="combo-text validatebox-text easyui-validatebox" autocomplete="off" style="width: 448px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="display: none; height: 22px;"></span></span><input type="hidden" class="combo-value" name="txtManufactureCompanyName" value="广西建机有限公司"></span>
                <a href="javascript:void(0);" id="btnAddManufactureCompany" style="display: none;
                   position: absolute; right: 60px; bottom: 7px;">新增单位</a>
            </p>
            <p>
                <label class="label">
                    产权单位:</label>
                <input type="text" id="txtOwnerCompanyName" class="lineinput combogridExt long combogrid-f combo-f" requesturl="/App_Ajax/Company.ashx?PostType=GetCompanyList&amp;CompanyType=OwnerCompany" validtype="sameText['#txtOwnerCompanyName','#btnAddOwnerCompany','该单位不存在，请重新选择或新增']" data-options="
                       textField: 'CompanyName',
                       idField: 'CompanyID',
                       required:true,
                       columns: [[
                       { field: 'CompanyName', title: '单位名称', width: 246 },
                       { field: 'Address', title: '单位地址', width: 200 }
                       ]]" value="未知" hiddenid="65c7303e-7dc1-4311-8635-94c77f4ee7f5" oldtext="未知" selectedtext="未知" comboname="txtOwnerCompanyName" style="display: none;"><span class="combo" style="width: 452px;"><input type="text" class="combo-text validatebox-text easyui-validatebox" autocomplete="off" style="width: 448px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="display: none; height: 22px;"></span></span><input type="hidden" class="combo-value" name="txtOwnerCompanyName" value="65c7303e-7dc1-4311-8635-94c77f4ee7f5"></span>
                <a href="javascript:void();" id="btnAddOwnerCompany" style="display: none; position: absolute;
                   right: 60px; bottom: 7px;">新增单位</a>
            </p>
            <p>
                <label class="label">
                    所属工程:</label>
                <input type="text" id="txtProjectName" class="lineinput combogridExt long combogrid-f combo-f" requesturl="/App_Ajax/Project.ashx?PostType=GetProjectList" validtype="sameText['#txtProjectName','#btnAddProject','该工程不存在，请重新选择或新增']" data-options="
                       textField: 'ProjectName',
                       required: true ,
                       idField: 'ProjectID',
                       columns: [[
                       { field: 'ProjectName', title: '工程名称', width: 220 },
                       { field: 'ContractorCompanyName', title: '施工单位', width: 140 },
                       { field: 'StationName', title: '监管机构', width: 85 }
                       ]]" value=" 滇池国际会展中心" hiddenid="9e574932-39d3-e311-85b8-7845c4ecc6e2" oldtext=" 滇池国际会展中心" selectedtext=" 滇池国际会展中心" comboname="txtProjectName" style="display: none;"><span class="combo" style="width: 452px;"><input type="text" class="combo-text validatebox-text easyui-validatebox" autocomplete="off" style="width: 448px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="display: none; height: 22px;"></span></span><input type="hidden" class="combo-value" name="txtProjectName" value=" 滇池国际会展中心"></span>
                <a href="javascript:void();" id="btnAddProject" style="display: none; position: absolute;
                   right: 60px; bottom: 7px;">新增工程</a>
            </p>
            <div class="divHeader">
                <div class="title2">
                    安装信息</div>
                <div style="width: 100%; background: gray; height: 2px;">
                </div>
            </div>
            <p>
                <label class="label">
                    设备SN码:</label>
                <input name="txtDeviceSN" type="text" id="txtDeviceSN" class="lineinput easyui-validatebox validatebox-text" required="true" delay="999999999" invalidmessage="该设备SN码已存在" onblur="validateDeviceSN(this, 'txtCustomNo');" value="010613060073" validtype="remote['/App_Ajax/MonitorRegister.ashx?PostType=IsDeviceSNExist&amp;OldDeviceSN=010613060073','DeviceSN']">
                <label class="label">
                    黑匣子编号:</label>
                <input name="txtCustomNo" type="text" id="txtCustomNo" class="lineinput" readonly="readonly" value="010613060073">
            </p>
            <p>
                <label class="label">
                    GPRS手机号:</label>
                <input name="txtGPRSTel" type="text" id="txtGPRSTel" class="lineinput easyui-validatebox validatebox-text" delay="999999999" invalidmessage="该手机号已存在" onblur="validate(this);" validtype="remote['/App_Ajax/MonitorRegister.ashx?PostType=IsGPRSTelExist&amp;OldGPRSTel=','GPRSTel']">
                <label class="label">
                    黑匣子安装日期:</label>
                <input name="txtDeviceInstallDate" type="text" id="txtDeviceInstallDate" class="lineinput easyui-validatebox validatebox-text" required="true" readonly="readonly" value="2014-02-24">
                <input type="button" class="dateinput  icon-date" onclick="WdatePicker({el: 'txtDeviceInstallDate'})">
            </p>
            <p>
                <label class="label">
                    黑匣子型号:</label>

                <select id="selDeviceSpecModel" class="easyui-combobox combobox-f combo-f" data-options="panelHeight:'auto',editable:false" style="width: 170px; display: none;" comboname="selDeviceSpecModel">
                    <option value="M2000">M2000</option>
                    <option value="MT200">MT200</option>
                    <option value="PM530s">PM530s</option>
                    <option value="MT105">MT105</option>
                    <option value="MT105p">MT105p</option>
                    <option value="PM530 ">PM530 </option>
                    <option value="PM530p">PM530p</option>
                    <option selected="selected" value="PMOther">PMOther</option>
                </select><span class="combo" style="width: 168px; height: 20px;"><input type="text" class="combo-text validatebox-text" autocomplete="off" readonly="readonly" style="width: 140px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="height: 22px;"></span></span><input type="hidden" class="combo-value" name="selDeviceSpecModel" value="PMOther"></span>
            </p>
            <p>
                <label class="label">
                    黑匣子生产厂商:</label>
                <input type="text" id="txtDeviceManufactureCompanyName" class="lineinput combogridExt long combogrid-f combo-f" requesturl="/App_Ajax/Company.ashx?PostType=GetCompanyList&amp;CompanyType=DeviceManufactureCompany" validtype="sameText['#txtDeviceManufactureCompanyName','#btnAddDeviceManufactureCompany','该单位不存在，请重新选择或新增']" data-options="
                       textField: 'CompanyName',
                       idField: 'CompanyID',
                       required:true,
                       columns: [[
                       { field: 'CompanyName', title: '单位名称', width: 246 },
                       { field: 'Address', title: '单位地址', width: 200 }
                       ]]" value="品茗科技" hiddenid="bd343e09-dfb7-46fe-b7f1-247f33810a40" oldtext="品茗科技" selectedtext="品茗科技" comboname="txtDeviceManufactureCompanyName" style="display: none;"><span class="combo" style="width: 452px;"><input type="text" class="combo-text validatebox-text easyui-validatebox" autocomplete="off" style="width: 448px; height: 22px; line-height: 22px;"><span><span class="combo-arrow" style="display: none; height: 22px;"></span></span><input type="hidden" class="combo-value" name="txtDeviceManufactureCompanyName" value="bd343e09-dfb7-46fe-b7f1-247f33810a40"></span>
                <a href="javascript:void();" id="btnAddDeviceManufactureCompany" style="display: none;
                   position: absolute; right: 60px; bottom: 7px;">新增单位</a>
            </p>
            <p>
                <label class="label">
                    功能配置:</label>
                <input name="chbHasTrolley" type="checkbox" id="chbHasTrolley" class="checkbox" checked="checked"><label class="label chblabel" for="chbHasTrolley">小车变幅传感器</label>
                <input name="chbHasHeight" type="checkbox" id="chbHasHeight" class="checkbox2"><label class="label chblabel" for="chbHasHeight">高度检测传感器</label>
                <input name="chbHasCrane" type="checkbox" id="chbHasCrane" class="checkbox2"><label class="label chblabel" for="chbHasCrane">吊重检测传感器</label>
            </p>
            <p>
                <input name="chbHasWindSpeed" type="checkbox" id="chbHasWindSpeed" class="checkbox3"><label class="label chblabel" for="chbHasWindSpeed">现场风速传感器</label>
                <input name="chbHasGyration" type="checkbox" id="chbHasGyration" class="checkbox2" checked="checked"><label class="label chblabel" for="chbHasGyration">塔吊回转传感器</label>
                <input name="chbHasRelay" type="checkbox" id="chbHasRelay" class="checkbox2"><label class="label chblabel" for="chbHasRelay">继电器输出控制</label>
            </p>
            <p>
                <input name="chbHasOblique" type="checkbox" id="chbHasOblique" class="checkbox3"><label class="label chblabel" for="chbHasOblique">防倾翻传感器</label>
            </p>
            <p>
                <label class="label">
                    识别模块:</label>
                <input name="chbHasIcCard" type="checkbox" id="chbHasIcCard" class="checkbox selectOne" onclick="selectOne(this)"><label class="label chblabel" for="chbHasIcCard">IC卡</label>
                <input name="chbHasFinger" type="checkbox" id="chbHasFinger" class="checkbox2 selectOne" onclick="selectOne(this)"><label class="label chblabel" for="chbHasFinger">指纹识别</label>
                <input name="chbHasFace" type="checkbox" id="chbHasFace" class="checkbox2 selectOne" onclick="selectOne(this)"><label class="label chblabel" for="chbHasFace">人脸识别</label>
            </p>
            <div class="divHeader">
                <div class="title2">
                    高级信息</div>
                <div style="width: 100%; background: gray; height: 2px;">
                </div>
            </div>
            <p>
                <label class="label">
                    最大起重量:</label>
                <input name="txtTCMaxWeight" type="text" id="txtTCMaxWeight" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="6.00">
                <label class="label">
                    额定起重力矩:</label>
                <input name="txtTCRatedTorque" type="text" id="txtTCRatedTorque" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="800.00">
            </p>
            <p>
                <label class="label">
                    最大独立高度:</label>
                <input name="txtTCMaxAloneHeight" type="text" id="txtTCMaxAloneHeight" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="42.00">
                <label class="label">
                    附着最大高度:</label>
                <input name="txtTCMaxExtHeight" type="text" id="txtTCMaxExtHeight" class="lineinput" validtype="number_positive" value="100.00">
            </p>
            <p>
                <label class="label">
                    最大幅度:</label>
                <input name="txtTCMaxRange" type="text" id="txtTCMaxRange" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="55.00">
                <label class="label">
                    最大幅度额定起重:</label>
                <input name="txtTCMaxRageWeight" type="text" id="txtTCMaxRageWeight" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="1.20">
            </p>
            <p class="InfoDisplayByIsDeviceAccess" style="">
                <label class="label">
                    臂长:</label>
                <input name="txtL1" type="text" id="txtL1" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="55">
                <label class="label">
                    平臂长:</label>
                <input name="txtL2" type="text" id="txtL2" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="13">
            </p>
            <p class="InfoDisplayByIsDeviceAccess" style="">
                <label class="label">
                    塔高:</label>
                <input name="txtH1" type="text" id="txtH1" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="100">
                <label class="label">
                    塔冒高:</label>
                <input name="txtH2" type="text" id="txtH2" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="0">
            </p>
            <p class="InfoDisplayByIsDeviceAccess" style="">
                <label class="label">
                    X坐标:</label>
                <input name="txtX" type="text" id="txtX" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="0">
                <label class="label">
                    Y坐标:</label>
                <input name="txtY" type="text" id="txtY" class="easyui-validatebox lineinput validatebox-text" validtype="number_positive" value="0">
            </p>
            <div>
                <div class="divHeader" style="margin: 15px auto 0 auto;">
                    <div class="title2" style="float: left;">
                        防碰撞信息</div>
                    <span id="titAnticollision1" style="font-family: 微软雅黑; color: rgb(102, 102, 102); float: right; display: none;">
                        温馨提示：保存成功后才可选择防碰撞</span> <span id="titAnticollision2" style="font-family: 微软雅黑; color: rgb(102, 102, 102); float: right;">温馨提示：当前设备不支持自定义防碰撞 <a href="javascript:void(0);" onclick="showAnticollisionHelp();" id="showAnticollisionHelp" style="text-decoration: none; margin-left: 10px; display: none;">
                            查看帮助</a></span> <a id="addAnticollision" onclick="openAnticollisionWindow()" style="float: right; margin-right: 6px; display: none;">新增防碰撞</a>
                    <div style="clear: both">
                    </div>
                </div>
                <div style="margin: 0px auto 0 auto; width: 92%;">
                    <table id="tableAnticollision" class="InnerTable" cellpadding="0" cellspacing="0">
                        <thead>
                            <tr>
                                <td style="width: 100px;">
                                    备案编号
                                </td>
                                <td>
                                    工地编号
                                </td>
                                <td style="width: 95px;">
                                    设备SN码
                                </td>
                                <td>
                                    X坐标
                                </td>
                                <td>
                                    Y坐标
                                </td>
                                <td id="tableAnticollision_td_Operate" style="width: 55px; white-space: nowrap; display: none;">
                                    操作
                                </td>
                            </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>
            <div class="divHeader" style="margin: 15px auto 0 auto;">
                <div class="title2" style="float: left;">
                    作业人员信息</div>
                <span id="titDriver" style="font-family: 微软雅黑; color: rgb(102, 102, 102); float: right; display: none;">温馨提示：保存成功后才可选择作业人员</span>
                <a id="addDriver" onclick="openDriverWindow('hdnselectOne')" style="float: right; margin-right: 6px;">
                    新增作业人员</a>
                <div style="clear: both">
                </div>
            </div>
            <div style="margin: 0px auto 0 auto; width: 92%;">
                <table id="tableDrivers" class="InnerTable" cellpadding="0" cellspacing="0">
                    <thead>
                        <tr>
                            <td style="width: 50px; white-space: nowrap">
                                姓名
                            </td>
                            <td style="width: 125px; white-space: nowrap">
                                身份证号
                            </td>
                            <td>
                                作业人员类型
                            </td>
                            <td>
                                验证类型 
                            </td>
                            <td>
                                到期时间
                            </td>
                            <td>
                                审核状态
                            </td>
                            <td id="tableDrivers_tdOperate" style="width: 40px; white-space: nowrap">
                                操作
                            </td>
                        </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
        </div>
    </form>  

<%@include  file="../footer.jsp" %>