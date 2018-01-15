<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap Core CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <!-- MetisMenu CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/metisMenu/2.7.2/metisMenu.min.css" rel="stylesheet">
        <!-- Custom CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/startbootstrap-sb-admin-2/3.3.7/css/sb-admin-2.min.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    </head>
    <body>
        <div id ="wrapper">
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Add new</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-10">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Create New Reader
                            </div>
                            <!--./panel-heading-->
                            <div class="panel-body">
                                <div class="col-lg-12">
                                    <s:form class="form-horizontal" action="ProductAction">
                                        <div class="row">
                                            <s:textfield label="Id" name="pro.Id" placeholder="Id" cssClass="form-control input-md" placeholder="Id Name" />
                                        </div>
                                        <div class="row">
                                            <s:textfield  name="pro.Name" label="Name" placeholder="Name" cssClass="form-control input-md" />
                                        </div>
                                        <div class="row">
                                            <s:textfield label="Quantity" name="pro.Quantity" placeholder="Quantity" cssClass="form-control input-md" />
                                        </div>
                                        <div class="row">
                                            <s:textfield label="Price" name="pro.Price" placeholder="Price" cssClass="form-control input-md" />
                                        </div>
                                        <div>
                                            
                                        </div>
                                        <!-- Change this to a button or input when using this as a form -->
                                        </fieldset>
                                        <div class="row">
                                            <s:submit  value="Save" cssClass="btn btn-default"/>
                                        </div>
                                    </s:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
