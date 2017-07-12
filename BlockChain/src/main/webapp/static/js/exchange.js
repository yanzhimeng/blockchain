/**
 * Created by zhijiansha on 2017-7-12.
 */

function show() {
    //得到选择器1对象
    var s1 = document.getElementById('s1');
    //得到选择器2对象
    var s2 = document.getElementById('s2');
    //在选择器2输出默认<option>选项
    //s2.innerHTML = '<option value="">--请选择--</option>';

    var s1vlu = $('#s1 option:selected').val();
    //alert(s1vlu);

    var arrs = new Array("aaa1","aaa2","aaa3")
    if(s1vlu=='BBB'){
        arrs = new Array("bbb1","bbb2","bbb3")
    }else if(s1vlu=='CCC'){
        arrs = new Array("ccc1","ccc2","ccc3")
    }

    //使用for循环来遍历数组(二维)
    for (var i = 0; i < arrs.length; i++) {
        //创建option元素
        var option = document.createElement('option');
        option.value = arrs[i];
        option.innerHTML = arrs[i];
        if(i==0){
            option.selected = true;
        }
        s2.appendChild(option);
    }

}
