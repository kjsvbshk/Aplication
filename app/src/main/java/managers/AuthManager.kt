package managers
// Clase para manejar la autenticación de usuarios
class AuthManager {
    private val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()

    // Método para iniciar sesión con correo electrónico y contraseña
    fun signInWithEmailAndPassword(email: String, password: String, callback: (Boolean, String?) -> Unit) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    callback(true, null)
                } else {
                    callback(false, task.exception?.message)
                }
            }
    }
}
