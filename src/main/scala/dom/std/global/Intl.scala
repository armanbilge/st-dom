package dom.std.global

import dom.std.Intl.Collator
import dom.std.Intl.CollatorOptions
import dom.std.Intl.DateTimeFormat
import dom.std.Intl.DateTimeFormatOptions
import dom.std.Intl.NumberFormat
import dom.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    @scala.inline
    def apply(): dom.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[dom.std.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String): dom.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String, options: CollatorOptions): dom.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.Collator]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): dom.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.Collator]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: CollatorOptions): dom.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.Collator]
    @scala.inline
    def apply(locales: Unit, options: CollatorOptions): dom.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
  }
  
  object DateTimeFormat {
    
    @scala.inline
    def apply(): dom.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[dom.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String): dom.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): dom.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): dom.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): dom.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: Unit, options: DateTimeFormatOptions): dom.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    @scala.inline
    def apply(): dom.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[dom.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String): dom.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: NumberFormatOptions): dom.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): dom.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[dom.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): dom.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: Unit, options: NumberFormatOptions): dom.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[dom.std.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
  }
}
