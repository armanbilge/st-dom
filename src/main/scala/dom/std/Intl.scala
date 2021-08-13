package dom.std

import dom.std.stdStrings.`2-digit`
import dom.std.stdStrings.`best fit`
import dom.std.stdStrings.basic
import dom.std.stdStrings.long
import dom.std.stdStrings.lookup
import dom.std.stdStrings.narrow
import dom.std.stdStrings.numeric
import dom.std.stdStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  @js.native
  trait Collator extends StObject {
    
    def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  object Collator {
    
    @scala.inline
    def apply(
      compare: (java.lang.String, java.lang.String) => Double,
      resolvedOptions: () => ResolvedCollatorOptions
    ): Collator = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[Collator]
    }
  }
  
  @js.native
  trait CollatorOptions extends StObject {
    
    var caseFirst: js.UndefOr[java.lang.String] = js.native
    
    var ignorePunctuation: js.UndefOr[scala.Boolean] = js.native
    
    var localeMatcher: js.UndefOr[java.lang.String] = js.native
    
    var numeric: js.UndefOr[scala.Boolean] = js.native
    
    var sensitivity: js.UndefOr[java.lang.String] = js.native
    
    var usage: js.UndefOr[java.lang.String] = js.native
  }
  object CollatorOptions {
    
    @scala.inline
    def apply(
      caseFirst: java.lang.String = null,
      ignorePunctuation: js.UndefOr[scala.Boolean] = js.undefined,
      localeMatcher: java.lang.String = null,
      numeric: js.UndefOr[scala.Boolean] = js.undefined,
      sensitivity: java.lang.String = null,
      usage: java.lang.String = null
    ): CollatorOptions = {
      val __obj = js.Dynamic.literal()
      if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst.asInstanceOf[js.Any])
      if (!js.isUndefined(ignorePunctuation)) __obj.updateDynamic("ignorePunctuation")(ignorePunctuation.asInstanceOf[js.Any])
      if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
      if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
      if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
      if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollatorOptions]
    }
  }
  
  @js.native
  trait DateTimeFormat extends StObject {
    
    def format(): java.lang.String = js.native
    def format(date: Date): java.lang.String = js.native
    def format(date: Double): java.lang.String = js.native
    
    def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
  }
  
  @js.native
  trait DateTimeFormatOptions extends StObject {
    
    var day: js.UndefOr[numeric | `2-digit`] = js.native
    
    var era: js.UndefOr[long | short | narrow] = js.native
    
    var formatMatcher: js.UndefOr[(`best fit`) | basic] = js.native
    
    var hour: js.UndefOr[numeric | `2-digit`] = js.native
    
    var hour12: js.UndefOr[scala.Boolean] = js.native
    
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
    
    var minute: js.UndefOr[numeric | `2-digit`] = js.native
    
    var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.native
    
    var second: js.UndefOr[numeric | `2-digit`] = js.native
    
    var timeZone: js.UndefOr[java.lang.String] = js.native
    
    var timeZoneName: js.UndefOr[long | short] = js.native
    
    var weekday: js.UndefOr[long | short | narrow] = js.native
    
    var year: js.UndefOr[numeric | `2-digit`] = js.native
  }
  object DateTimeFormatOptions {
    
    @scala.inline
    def apply(
      day: numeric | `2-digit` = null,
      era: long | short | narrow = null,
      formatMatcher: (`best fit`) | basic = null,
      hour: numeric | `2-digit` = null,
      hour12: js.UndefOr[scala.Boolean] = js.undefined,
      localeMatcher: (`best fit`) | lookup = null,
      minute: numeric | `2-digit` = null,
      month: numeric | `2-digit` | long | short | narrow = null,
      second: numeric | `2-digit` = null,
      timeZone: java.lang.String = null,
      timeZoneName: long | short = null,
      weekday: long | short | narrow = null,
      year: numeric | `2-digit` = null
    ): DateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
      if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
      if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
      if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
      if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.asInstanceOf[js.Any])
      if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
      if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
      if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
      if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
      if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
      if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
      if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
      if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeFormatOptions]
    }
  }
  
  @js.native
  trait NumberFormat extends StObject {
    
    def format(value: Double): java.lang.String = js.native
    
    def resolvedOptions(): ResolvedNumberFormatOptions = js.native
  }
  object NumberFormat {
    
    @scala.inline
    def apply(format: Double => java.lang.String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[NumberFormat]
    }
  }
  
  @js.native
  trait NumberFormatOptions extends StObject {
    
    var currency: js.UndefOr[java.lang.String] = js.native
    
    var currencyDisplay: js.UndefOr[java.lang.String] = js.native
    
    var currencySign: js.UndefOr[java.lang.String] = js.native
    
    var localeMatcher: js.UndefOr[java.lang.String] = js.native
    
    var maximumFractionDigits: js.UndefOr[Double] = js.native
    
    var maximumSignificantDigits: js.UndefOr[Double] = js.native
    
    var minimumFractionDigits: js.UndefOr[Double] = js.native
    
    var minimumIntegerDigits: js.UndefOr[Double] = js.native
    
    var minimumSignificantDigits: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[java.lang.String] = js.native
    
    var useGrouping: js.UndefOr[scala.Boolean] = js.native
  }
  object NumberFormatOptions {
    
    @scala.inline
    def apply(
      currency: java.lang.String = null,
      currencyDisplay: java.lang.String = null,
      currencySign: java.lang.String = null,
      localeMatcher: java.lang.String = null,
      maximumFractionDigits: js.UndefOr[Double] = js.undefined,
      maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
      minimumFractionDigits: js.UndefOr[Double] = js.undefined,
      minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
      minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
      style: java.lang.String = null,
      useGrouping: js.UndefOr[scala.Boolean] = js.undefined
    ): NumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
      if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
      if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
      if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
      if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
      if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
      if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
      if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
      if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
      if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFormatOptions]
    }
  }
  
  @js.native
  trait ResolvedCollatorOptions extends StObject {
    
    var caseFirst: java.lang.String = js.native
    
    var collation: java.lang.String = js.native
    
    var ignorePunctuation: scala.Boolean = js.native
    
    var locale: java.lang.String = js.native
    
    var numeric: scala.Boolean = js.native
    
    var sensitivity: java.lang.String = js.native
    
    var usage: java.lang.String = js.native
  }
  object ResolvedCollatorOptions {
    
    @scala.inline
    def apply(
      caseFirst: java.lang.String,
      collation: java.lang.String,
      ignorePunctuation: scala.Boolean,
      locale: java.lang.String,
      numeric: scala.Boolean,
      sensitivity: java.lang.String,
      usage: java.lang.String
    ): ResolvedCollatorOptions = {
      val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedCollatorOptions]
    }
  }
  
  @js.native
  trait ResolvedDateTimeFormatOptions extends StObject {
    
    var calendar: java.lang.String = js.native
    
    var day: js.UndefOr[java.lang.String] = js.native
    
    var era: js.UndefOr[java.lang.String] = js.native
    
    var hour: js.UndefOr[java.lang.String] = js.native
    
    var hour12: js.UndefOr[scala.Boolean] = js.native
    
    var locale: java.lang.String = js.native
    
    var minute: js.UndefOr[java.lang.String] = js.native
    
    var month: js.UndefOr[java.lang.String] = js.native
    
    var numberingSystem: java.lang.String = js.native
    
    var second: js.UndefOr[java.lang.String] = js.native
    
    var timeZone: java.lang.String = js.native
    
    var timeZoneName: js.UndefOr[java.lang.String] = js.native
    
    var weekday: js.UndefOr[java.lang.String] = js.native
    
    var year: js.UndefOr[java.lang.String] = js.native
  }
  object ResolvedDateTimeFormatOptions {
    
    @scala.inline
    def apply(
      calendar: java.lang.String,
      locale: java.lang.String,
      numberingSystem: java.lang.String,
      timeZone: java.lang.String,
      day: java.lang.String = null,
      era: java.lang.String = null,
      hour: java.lang.String = null,
      hour12: js.UndefOr[scala.Boolean] = js.undefined,
      minute: java.lang.String = null,
      month: java.lang.String = null,
      second: java.lang.String = null,
      timeZoneName: java.lang.String = null,
      weekday: java.lang.String = null,
      year: java.lang.String = null
    ): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
      if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
      if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
      if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.asInstanceOf[js.Any])
      if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
      if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
      if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
      if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
      if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
      if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
  }
  
  @js.native
  trait ResolvedNumberFormatOptions extends StObject {
    
    var currency: js.UndefOr[java.lang.String] = js.native
    
    var currencyDisplay: js.UndefOr[java.lang.String] = js.native
    
    var locale: java.lang.String = js.native
    
    var maximumFractionDigits: Double = js.native
    
    var maximumSignificantDigits: js.UndefOr[Double] = js.native
    
    var minimumFractionDigits: Double = js.native
    
    var minimumIntegerDigits: Double = js.native
    
    var minimumSignificantDigits: js.UndefOr[Double] = js.native
    
    var numberingSystem: java.lang.String = js.native
    
    var style: java.lang.String = js.native
    
    var useGrouping: scala.Boolean = js.native
  }
  object ResolvedNumberFormatOptions {
    
    @scala.inline
    def apply(
      locale: java.lang.String,
      maximumFractionDigits: Double,
      minimumFractionDigits: Double,
      minimumIntegerDigits: Double,
      numberingSystem: java.lang.String,
      style: java.lang.String,
      useGrouping: scala.Boolean,
      currency: java.lang.String = null,
      currencyDisplay: java.lang.String = null,
      maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
      minimumSignificantDigits: js.UndefOr[Double] = js.undefined
    ): ResolvedNumberFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
      if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
      if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
      if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
      if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedNumberFormatOptions]
    }
  }
}
