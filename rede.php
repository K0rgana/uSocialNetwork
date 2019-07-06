<?php 

	include_once 'header.php';
	// $iniciar = curl_init('http://localhost:8000')

 ?>

	<div class="header">
	  <a href="#" class="logo">Rede</a>
	  <div class="header-right">
	    <form action="http://localhost:8000" method="POST">
	    	<span>Cadastrar</span>
			<input class="input1" type="input" name="email" placeholder="E-mail">
	        <input class="input1" type="input" name="password" placeholder="Senha">
	        <input class="input1" type="submit" name="Send">
		</form>
	  </div>
	</div>

	<div class="int">
		<h1>Entrar</h1>
		<form action="http://localhost:8000" method="POST">
			<input class="input2" type="input" name="email" placeholder="E-mail">
	        <br>
	        <br>
	        <input class="input2" type="input" name="password" placeholder="Senha">
	        <br>
	        <br>
	        <input class="input2" type="submit" name="Send">
		</form>
	</div>
</body>
</html>

