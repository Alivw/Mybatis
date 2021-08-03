<html>
<body>
<h2>Hello World!</h2>
</body>

<button id="c">cccc</button>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>

<script>

    $(function (){
        $("#c").click(function () {
            // alert(123)

            var ids = ['1', '2'];
            $.ajax({
                url: 'hellouser',
                contentType: 'application/json',
                traditional: true,
                data:{
                    ids: ids
                }


            });
        });
    })
</script>
</html>
