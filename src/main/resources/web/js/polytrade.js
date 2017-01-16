/**
 * @author hedi brahim <hedi.brahim@gmail.com>
 * version: 1.0.0
 * https://github.com/hedibrahim/polytrade/
 */

function enMillimes(value) {
    //var v = value * 1.18;
    return value.toFixed(3).replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,");
}




function detailFormatter(value, row, index) {
    //html.push('<p><b>' + key + ':</b> ' + value + '</p>');

    return['<form class="form-horizontal">',
        '<div class="form-group">',
        '<div class="col-sm-6">',
        '<label for="numero">Numero</label>',
        '<span> </span>',
        '<input type="email" class="form-control col-sm-5" id="numero" placeholder="' + row.numero + '" readonly>',
        '</div>',
        '</div>',
        '</form>'].join('');
}


function articleActions(value, row, index) {
    return [
        '<a id="fiche_article" href="javascript:void(0)" title="Fiche Article">',
        '<span class="glyphicon glyphicon-list-alt"></span>',
        '</a>'
    ].join('');
}

window.articleEvents = {
    'click #fiche_article': function (e, value, row, index) {
        //alert('You click inventaire icon, row: ' + JSON.stringify(row.article.reference));		
        window.open('fiche_article/' + row.id, '_self', false);
        //console.log(row.article);
    }
};


$(document).ready(function () {
    //document.getElementById("eventsTable").focus();
    //document.getElementsByClassName("search").focus();
    //$('.ui.sidebar').sidebar({context: $('.bottom.segment')}).sidebar('attach events', '.menu .item');
    $(".search").append('<span class="glyphicon glyphicon-search"></span>');
    $("div.search > input").focus();
});