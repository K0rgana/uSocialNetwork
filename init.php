<?php
require_once("http://localhost:8080/rede.php");
$System = java("java.lang.System");
echo $System->getProperties();

$javaPHP = new Java('JavaPHP');
$javaPHP->setNome("Java+PHP");
echo "Método do Java = " . $javaPHP->getNome();

$obj = new Java('User.java');

	$email = POST('email');
    $autor = POST('autor');
    $usuarioEmail = currentUserEmail();

    $data = juntar([$usuarioEmail, $email, $autor]) . "\n";

    $handle = fopen('user.csv', 'a');
    fwrite($handle, $data);
?>