package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (implicit ec: ExecutionContext) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action.async {
    Future(Ok(views.html.index("Your new application is ready.")))
  }

  def cv = Action.async { Future(Ok(views.html.cv())) }
  def liff = Action.async { Future(Ok(views.html.liff())) }
  def contact = Action.async { Future(Ok(views.html.contact())) }
  def links = Action.async { Future(Ok(views.html.links())) }
  def alist = Action.async { Future(Ok(views.html.alist())) }
  def acme = Action.async { Future(Ok("YCAN9wIWZfn-_ZifwfNy4KSIfcUFZJ7t18n-m0Us3_w.9XrxGgZHeNggsJzMKAdVO3ln7FIUOM38fCADCQljEjQ")) }
}
