package managers

// Clase para manejar eventos y notificaciones
class NotificationManager {
    private val firebaseMessaging: FirebaseMessaging = FirebaseMessaging.getInstance()

    // Método para enviar una notificación push
    fun sendNotification(token: String, title: String, message: String) {
        val notification = RemoteMessage.Builder(token)
            .setMessageId(UUID.randomUUID().toString())
            .setData(mapOf("title" to title, "message" to message))
            .build()
        firebaseMessaging.send(notification)
    }
}
