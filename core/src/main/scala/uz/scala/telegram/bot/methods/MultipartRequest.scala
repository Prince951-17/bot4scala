package uz.scala.telegram.bot.methods

import uz.scala.telegram.bot.models.InputFile

/**
 * Base type for multipart API requests (for file uploads)
 *
 * @tparam R Expected result type.
 *
 * Request will be serialized as multipart/form-data
 */
trait MultipartRequest[R] extends Request[R] {
  def getFiles: List[(String, InputFile)]
}
