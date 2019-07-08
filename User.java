public class User {

    var String email;
    var String senha;

    public static void User(String email, String senha) throws JSONException, IOException {

        FileWriter arquivoUsuario = new FileWriter("usuarios.txt", true);

        Usuario usuario = new Usuario(email, senha, new ArrayList<Produto>());
        JSONObject jsonUsuario = new JSONObject();
        jsonUsuario.put("email", usuario.getEmail());
        jsonUsuario.put("senha", usuario.getSenha());
        arquivoUsuario.write(jsonUsuario.toString() + "\n");
        arquivoUsuario.close();
    }

    btncadastro.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String email = email.getText().toString();
            String senha = senha.getText().toString();
            String confirmaSenha = confsenha.getText().toString();
            Controller.salvaUsuario(CriarConta.this,nome,email,senha);
            Intent intent = new Intent(CriarConta.this, BemVindo.class);
            Bundle params = new Bundle();
            params.putString("IDusuario",email);
            intent.putExtras(params);
            startActivity(intent);
        } catch (JSONException e) {
                    e.printStackTrace();
            } catch (IOException e) {
                    e.printStackTrace();
                }
    });
}