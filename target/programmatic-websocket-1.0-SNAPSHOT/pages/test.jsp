<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Test Page</h1>

    <input type="text" onkeypress="onInput(event)"/>

    <div id="response"></div>

    <a href="../welcome.jsp">Welcome Page</a>

</body>
    <script type="text/javascript">



        <%--websocket-annotated--%>
        var websocket = new WebSocket('ws://localhost:8080/websocket-annotated');

        websocket.onopen=function (event) {
            console.log('onOpen client ');
            console.log(event);
        };
        websocket.onmessage = function (p1) {
            document.getElementById(
                'response'
            ).innerHTML = p1.data;
        };
        websocket.onclose = function (p1) {
            console.log('onClose');
            console.log(p1);
        };
        websocket.onerror = function (event) {
            console.log('onError');
            console.log(event);
        };

        function onInput(event){
            if(event.keyCode === 13){
                websocket.send(event.target.value.trim());
            }
        }

    </script>
</html>
