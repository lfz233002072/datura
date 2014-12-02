(function ($) {
    $("a[data-ajax-custom=true]").live("click", function (evt) {
        evt.preventDefault();
        var targetUpdateId = $(this).attr("data-ajax-update");
        var viewstateHiddenId = $(this).attr("data-ajax-viewstate");
        var params = [];
        if (viewstateHiddenId != undefined && viewstateHiddenId != null) {
            params = [{ name: "SearchHitViewState", value: $("#" + viewstateHiddenId).val()}];
        }
        loadingPager(targetUpdateId, $(this).attr("href"), params);
    });
} (jQuery));

function loadingPager(targetUpdateId, url, params) {
    $.ajax({
        type: "POST",
        url: url,
        data: params,
        beforeSend: function () {
            showLoading();
        },
        complete: function () {
            closeLoading();
        },
        success: function (data) {
            $("#" + targetUpdateId).html(data);
        },
        error: function (xhr, error) {
            FailureCallback(xhr, error);
        }
    });
}

function PagerIndexChanged(obj) {
    var targetUpdateId = $(obj).attr("data-ajax-update");
    var viewstateHiddenId = $(obj).attr("data-ajax-viewstate");
    var params = [];
    if (viewstateHiddenId != undefined && viewstateHiddenId != null) {
        params = [{ name: "SearchHitViewState", value: $("#" + viewstateHiddenId).val()}];
    }
    loadingPager(targetUpdateId, $(obj).val(), params);
}