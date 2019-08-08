var current = 1;
$(function(){
    getArticlePage(current);
    $('#add-article').click(function(){
        getArticlePage(current);
    });
});

function getArticlePage(currPage){
    $.ajax({
        method: "POST",
        url: '/article',
        data: {
            currPage: currPage,
            pageSize: 8,
        },
        success: function(data){
            if(data.code == '200'){
                var articlePage = data.result.articlePage;
                if(articlePage.length == 0){
                    $("#add-article").html('没有更多了')
                }
                $.each(articlePage.records, function(index, article) {
                    showArts(article,$('#article-list'));
                    current = articlePage.current + 1;
                });

            }else{
                dangerNotify(data.message);
            }
        }
    });
}

function showArts( data ,obj){
    var partials = {date: getdays_(data.createTime)}
    var content = Mustache.render($('#template').html(),data,partials);
    obj.append(content);
}