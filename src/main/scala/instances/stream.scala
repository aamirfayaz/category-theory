package instances

object stream {

  def unfold[A, B](a: A)(f: A => Option[(B, A)]): Stream[B] = f(a) match {
    case Some((b, a)) => b #:: unfold(a)(f)
    case None         => Stream.empty
  }
}
