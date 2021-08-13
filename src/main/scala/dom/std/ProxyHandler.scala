package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyHandler[T /* <: js.Object */] extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.Array[js.Any], js.Any]
  ] = js.native
  
  var construct: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* argArray */ js.Array[js.Any], 
      /* newTarget */ js.Function, 
      js.Object
    ]
  ] = js.native
  
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ java.lang.String | js.Symbol, 
      /* attributes */ PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.native
  
  var deleteProperty: js.UndefOr[
    js.Function2[/* target */ T, /* p */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.native
  
  var get: js.UndefOr[
    js.Function3[/* target */ T, /* p */ java.lang.String | js.Symbol, /* receiver */ js.Any, js.Any]
  ] = js.native
  
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[/* target */ T, /* p */ java.lang.String | js.Symbol, js.UndefOr[PropertyDescriptor]]
  ] = js.native
  
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.native
  
  var has: js.UndefOr[
    js.Function2[/* target */ T, /* p */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.native
  
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, ArrayLike[java.lang.String | js.Symbol]]] = js.native
  
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.native
  
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ java.lang.String | js.Symbol, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Object | Null, scala.Boolean]] = js.native
}
object ProxyHandler {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    apply: (/* target */ T, /* thisArg */ js.Any, /* argArray */ js.Array[js.Any]) => js.Any = null,
    construct: (/* target */ T, /* argArray */ js.Array[js.Any], /* newTarget */ js.Function) => js.Object = null,
    defineProperty: (/* target */ T, /* p */ java.lang.String | js.Symbol, /* attributes */ PropertyDescriptor) => scala.Boolean = null,
    deleteProperty: (/* target */ T, /* p */ java.lang.String | js.Symbol) => scala.Boolean = null,
    get: (/* target */ T, /* p */ java.lang.String | js.Symbol, /* receiver */ js.Any) => js.Any = null,
    getOwnPropertyDescriptor: (/* target */ T, /* p */ java.lang.String | js.Symbol) => js.UndefOr[PropertyDescriptor] = null,
    getPrototypeOf: /* target */ T => js.Object | Null = null,
    has: (/* target */ T, /* p */ java.lang.String | js.Symbol) => scala.Boolean = null,
    isExtensible: /* target */ T => scala.Boolean = null,
    ownKeys: /* target */ T => ArrayLike[java.lang.String | js.Symbol] = null,
    preventExtensions: /* target */ T => scala.Boolean = null,
    set: (/* target */ T, /* p */ java.lang.String | js.Symbol, /* value */ js.Any, /* receiver */ js.Any) => scala.Boolean = null,
    setPrototypeOf: (/* target */ T, /* v */ js.Object | Null) => scala.Boolean = null
  ): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction3(apply))
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction3(construct))
    if (defineProperty != null) __obj.updateDynamic("defineProperty")(js.Any.fromFunction3(defineProperty))
    if (deleteProperty != null) __obj.updateDynamic("deleteProperty")(js.Any.fromFunction2(deleteProperty))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction3(get))
    if (getOwnPropertyDescriptor != null) __obj.updateDynamic("getOwnPropertyDescriptor")(js.Any.fromFunction2(getOwnPropertyDescriptor))
    if (getPrototypeOf != null) __obj.updateDynamic("getPrototypeOf")(js.Any.fromFunction1(getPrototypeOf))
    if (has != null) __obj.updateDynamic("has")(js.Any.fromFunction2(has))
    if (isExtensible != null) __obj.updateDynamic("isExtensible")(js.Any.fromFunction1(isExtensible))
    if (ownKeys != null) __obj.updateDynamic("ownKeys")(js.Any.fromFunction1(ownKeys))
    if (preventExtensions != null) __obj.updateDynamic("preventExtensions")(js.Any.fromFunction1(preventExtensions))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction4(set))
    if (setPrototypeOf != null) __obj.updateDynamic("setPrototypeOf")(js.Any.fromFunction2(setPrototypeOf))
    __obj.asInstanceOf[ProxyHandler[T]]
  }
}
