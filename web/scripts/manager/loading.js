//加载层
var loading = {
    show: function () {
        var loadingDiv = $("#loadingOverlayDiv");
        if (loadingDiv.size() == 0) {
            loadingDiv = $("<div/>");
            $(loadingDiv).attr("id", "loadingOverlayDiv");
            $(loadingDiv).addClass("ui-widget-overlay");
            $(loadingDiv).addClass("tc");
            $(loadingDiv).append($("<div/>").addClass("loading"));
            $(loadingDiv).height($(window).height() / 2);
            $(loadingDiv).css("padding-top", $(window).height() / 2).css("z-index", "9999");
            $("body").append(loadingDiv);
            loadingDiv = $("#loadingOverlayDiv");
            $(window).resize(function (e) {
                //保证拖动时，居中
                if ($(".ui-widget-overlay").offset()) {
                    $(".ui-widget-overlay").height($(window).height());
                }
            });
        }
        loadingDiv.show();
        setTimeout("loading.close()", 10000);
    },
    close: function () {
        var loadingDiv = $("#loadingOverlayDiv");
        if (loadingDiv.size() > 0) {
            loadingDiv.hide();
        }
    }
};