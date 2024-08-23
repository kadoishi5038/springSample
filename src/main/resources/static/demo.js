'use strict';

//フォーム名を指定して新しいウィンドウを開く
function openWin(formName){
    let form = document.forms[formName];
    if(!form){
        alert('指定したフォームが取得できませんでした');
        return;
    }
    let win = window.open('about:blank', formName);
    form.target = formName;
    form.submit();
    win.focus();
}