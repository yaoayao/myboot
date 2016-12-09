<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf8" />
    <title>iFlytek Web Api</title>
    <meta name="keywords" content="free mobile website templates, free mobile website template, free iphone template, free android template, free high end touch mobile templates, free high end touch mobile template" />
    <meta name="description" content="Get free mobile website templates for Iphone , Android and High end touch mobile devices" />
    <link href="/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/js/jquery1.7.js"></script>

</head>

<body>
<div id="header">
</div>
<div class="clear"></div>
<div>
    <select name="cars" id="select">
        <option value="address">你的地址是</option>
        <option value="phone">你的电话是</option>
        <option value="date">你的生日是</option>
        <option value="sex">你的性别是</option>
    </select>
    <input type="text" id='iat_result'></input>
    <input type="button" id="ok" value="确定"/>
</div>
<div style="height:10px;width: auto">

</div>


<div style="position:relative">
    <div id='a'>点击开始录音</div>
    <div id="canvas_wrapper" style="display:none">
        <div style="display: inline">&spades;</div>
        <canvas id="volume" height="4"></canvas>
    </div>
</div>
<script>
    onerror=function(a,b,c){
        alert(a+b+c);
    }
    $(document).ready(function(){
        $("#ok").click(function(){
            var select = $("#select").select().val();
            var result = $("#iat_result").val();
            console.log(select + "--" +result);
            $.ajax({
                url: "save",
                data:{select:select,result:result},
                dataType:"json",
                success:function(data){
                    if(data.result == "success"){
                        alert("done")
                    }
                },
            });
        });

        $("#select").change(function(){
            $("#iat_result").val("");
        })
    });


</script>
<script type="text/javascript" src='/js/fingerprint2.min.js'></script>
<script type="text/javascript" src="/js/iat.all.js"></script>
<script type="text/javascript" src="/js/demo.js"></script>
</body>
</html>
