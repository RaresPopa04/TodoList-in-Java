<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Add Todo Page</title>

    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div>
    <div class ="container">
        <h1>Enter ToDo Details</h1>
        <form action="add-todo" method="post">
            Description: <input type="text" name="description" required>
            <input type ="submit" class="btn btn-success">
        </form>
    </div>



    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</div>

</body>
</html>