
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
       <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->

    </head>
    <body>
        <div class ="container"> 

            <h1> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> Enquiry</h1>
            <form method ="post" action="insertEnquiry.jsp">
                <div class="form-group">
                    <label>First Name</label>
                    <input type="text" name="firstName" class="form-control" required="required" placeholder="First Name">
                </div>
                <div class="form-group">
                    <label>Last Name</label>
                    <input type="text" name="lastName" class="form-control" required="required" placeholder="Last Name">
                </div>
                <div class="form-group">
                    <label>Contact No</label>
                    <input type="text" name="contactNo" class="form-control" required="required" placeholder="ContactNo">
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input type="text" name="email" class="form-control" required="required" placeholder="Email">
                </div>
                <div class="form-group">
                    <label>Description</label>
                    <textarea type="text" name="description" class="form-control" required="required" placeholder="Description" style="height:200px" ></textarea>
                </div>

                <button type="submit" class="btn btn-success"  >
                    <span class="glyphicon glyphicon-ok" aria-hidden="true" ></span> Submit</button>

            </form>


        </div>
    </body>
</html>

