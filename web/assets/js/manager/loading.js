//加载层
var loading = {
    show: function () {
        var loadingDiv = $("#loadingOverlayDiv");
        var loadingCent = $("#loading");
        if (loadingDiv.size() == 0) {
            loadingCent = $("<div>", {
                "class": "loading",
                "id": "loading",
                "html":"请等待..."
            });
            loadingDiv = $("<div>", {
                "id": "loadingOverlayDiv",
                "class": "loading-ui-widget-overlay tc"
            });

            $(loadingDiv).height($(window).height() / 2);
            $(loadingDiv).css("padding-top", $(window).height() / 2).css("z-index", "9999");
            loadingCent.css("z-index","10000");
            $("body").append(loadingDiv);
            loadingDiv.after(loadingCent);
            loadingDiv = $("#loadingOverlayDiv");
            $(window).resize(function (e) {
                //保证拖动时，居中
                if ($(".loading-ui-widget-overlay").offset()) {
                    $(".loading-ui-widget-overlay").height($(window).height());
                }
            });
        }
        loadingDiv.show();
        loadingCent.show();
        setTimeout("loading.close()", 10000);
    },
    close: function () {
        var loadingDiv = $("#loadingOverlayDiv");
        var loadingCent = $("#loading");
        if (loadingDiv.size() > 0) {
            loadingDiv.hide();
            loadingCent.hide();
        }
    }
};