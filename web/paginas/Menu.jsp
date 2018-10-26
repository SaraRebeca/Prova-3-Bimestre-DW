<%-- 
    Document   : Menu
    Created on : 05/07/2018, 21:14:19
    Author     : Sara
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Menu</title>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Social Buttons CSS -->
        <link href="../vendor/bootstrap-social/bootstrap-social.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Menu</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->

            <div class="panel panel-default">

                <!-- /.panel-heading -->
                <div class="panel-body">
                    <h4>Para qual tela você deseja ir?</h4>
                    <p>
                    <table border="2">
                        <tr>

                            <th><a href="/cliente">Listagem de Clientes</a></th>
                            <th><a href="/tratamentos">Listagem de Tratamentos</a></th>
                            <th><a href="/paginas/TipoTratamento.jsp">Listagem de Tipos de Tratamento</a></th> 
                            <th><a href="/paginas/Cadastro.jsp">Cadastro de Tipos de Tratamentos</a> </th>
                            <th><a href="/paginas/CadastroTratamento.jsp">Cadastro de Tratamentos</a> </th>
                            <th><a href="/paginas/CadastroCliente.jsp">Cadastro de Cliente</a> </th>
                        </tr>
                    </table>
                    </p>
                </div>
            </div>
        </div>
        <!-- /#page-wrapper -->


        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="../vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../vendor/metisMenu/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>

    </body>

</html>
