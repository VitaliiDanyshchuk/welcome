<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h1>Hello Frontend</h1>
<div>
    <table class="table table-striped table-dark">
        <tr>
            <th>Name</th>
            <th>Description </th>
            <th>Chief</th>
            <th>Delete</th>
            <th>Update</th>
            <th>Info</th>


        </tr>



        <#list list as item>
        <tr>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td>${item.chief}</td>
            <td><a href="http://localhost:8080/web/cafedra/delete/${item.id}">
                    <input type="button" value="delete" class="btn-danger">
                </a> </td>
            <td><a  href="http://localhost:8080/web/cafedra/update/${item.id}">
                <input type="button", value="Update" class="btn-primary" >
            </a> </td>
            <td>
                <a href="#">
                    <input type="button" value="info" class="btn-danger">
                </a>
            </td>


        </tr>
    </#list>
    </table>

    <div>
<span> <a href="/web/cafedra/reloadDB">
    <input class="btn-primary" type="button", value="Reload Database" >
    </a></span>

    <span> <a  href="/web/cafedra/create">
            <input class="btn-primary" type="button", value="Create" >
        </a></span>

    </div>


   <!-- <div>
        <form>
            <div class = "form-group">

            <input type="text" name="name" placeholder="id">
            <br>
            <input type="text" name="description" placeholder="description">
            <br>
            <input type="text" name="chief" placeholder="chief">
            <br>

            <input type="submit" value="CREATE">
                </div>
        </form>
    </div>
-->


</div>
</body>
</html>