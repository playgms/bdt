abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification

def showNotification(notification: Notification): String = notification match {
  case Email(email, title, _) => s"You got an email from $email with title: $title"
  case SMS(number, message) => s"You got an SMS from $number! Message: $message"
}

val emailNotification = Email("john@example.com", "Meeting Reminder", "Don't forget the meeting at 10 AM.")
val smsNotification = SMS("123-456-7890", "Your package has been delivered.")
println(showNotification(emailNotification))
println(showNotification(smsNotification))
