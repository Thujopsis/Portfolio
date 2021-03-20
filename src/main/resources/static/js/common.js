DELETE_MESSAGE = "削除してもよろしいですか？";

$(document).ready(function() {
    $('.delete-action').click(function() {
        if(!confirm(DELETE_MESSAGE)){
            return false;
        }
    });

} );
