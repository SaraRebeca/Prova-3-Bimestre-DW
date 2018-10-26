
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Cadastro de Tratamentos</title>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

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
       <%// <fieldset>

            //<div>
              //  <img src="/paginas/flor.png" width="150" height="150" alt="descrição da imagem" />
            //</div>
        // </fieldset>
                       %>


        <div class="container">

            <div class="row">
                <div class="col-md-4 col-md-offset-4">

                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Cadastre o Cliente</h3>
                        </div>
                        <div class="panel-body">
                            <form method="post" action="${pageContext.request.contextPath}/cliente">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Id" name="idCliente" type="idCliente" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Nome" name="nomeCliente" type="nomeCliente" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="telefone" name="telefoneCliente" type="telefone_liente" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="cpf" name="cpfCliente" type="cpf_cliente" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="email" name="emailCliente" type="email_cliente" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="nº cartão" name="numeroCartaoCredito" type="numero_cartao_credito" autofocus>
                                    </div>
                                    
                                    <button type="submit" class="btn btn-default" name="okay">Salvar</>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

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

