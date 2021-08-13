package dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object std {
  
  type AlgorithmIdentifier = java.lang.String | dom.std.Algorithm
  
  type ArrayBufferLike = dom.std.ArrayBuffer
  
  type AudioWorklet = dom.std.Worklet
  
  type AutoKeyword = dom.std.stdStrings.auto
  
  type BigInteger = dom.std.Uint8Array
  
  type BlobCallback = js.Function1[/* blob */ dom.std.Blob | scala.Null, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - dom.std.BufferSource
    - dom.std.Blob
    - java.lang.String
  */
  type BlobPart = dom.std._BlobPart | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - dom.std.Blob
    - dom.std.BufferSource
    - dom.std.FormData
    - dom.std.URLSearchParams
    - dom.std.ReadableStream[dom.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = dom.std._BodyInit | dom.std.ReadableStream[dom.std.Uint8Array] | java.lang.String
  
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = dom.std.Text
  
  type COSEAlgorithmIdentifier = scala.Double
  
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = dom.std.CSSConditionRule
  
  /**
    * Convert first character of string literal type to uppercase
    */
  type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = dom.std.AudioNode
  
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = dom.std.AudioNode
  
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = dom.std.CharacterData
  
  type ConstrainBoolean = scala.Boolean | dom.std.ConstrainBooleanParameters
  
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | dom.std.ConstrainDOMStringParameters
  
  type ConstrainDouble = scala.Double | dom.std.ConstrainDoubleRange
  
  type ConstrainULong = scala.Double | dom.std.ConstrainULongRange
  
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  
  type DOMHighResTimeStamp = scala.Double
  
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type DOMTimeStamp = scala.Double
  
  type DecodeErrorCallback = js.Function1[/* error */ dom.std.DOMException, scala.Unit]
  
  type DecodeSuccessCallback = js.Function1[/* decodedData */ dom.std.AudioBuffer, scala.Unit]
  
  type DocumentTimeline = dom.std.AnimationTimeline
  
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = dom.std.HTMLElementTagNameMap with (dom.std.Pick[
    dom.std.SVGElementTagNameMap, 
    dom.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
    ]
  ])
  
  type EvalError = dom.std.Error
  
  type EventHandlerNonNull = js.Function1[/* event */ dom.std.Event, js.Any]
  
  type EventListener = js.Function1[/* evt */ dom.std.Event, scala.Unit]
  
  type EventListenerOrEventListenerObject = dom.std.EventListener | dom.std.EventListenerObject
  
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  
  type Float32List = dom.std.Float32Array | js.Array[dom.std.GLfloat]
  
  type ForEachCallback = js.Function2[
    /* keyId */ dom.std.Int8Array | dom.std.Int16Array | dom.std.Int32Array | dom.std.Uint8Array | dom.std.Uint16Array | dom.std.Uint32Array | dom.std.Uint8ClampedArray | dom.std.Float32Array | dom.std.Float64Array | dom.std.DataView | dom.std.ArrayBuffer | scala.Null, 
    /* status */ dom.std.MediaKeyStatus, 
    scala.Unit
  ]
  
  type FormDataEntryValue = dom.std.File | java.lang.String
  
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  
  type GLbitfield = scala.Double
  
  type GLboolean = scala.Boolean
  
  type GLclampf = scala.Double
  
  type GLenum = scala.Double
  
  type GLfloat = scala.Double
  
  type GLint = scala.Double
  
  type GLint64 = scala.Double
  
  type GLintptr = scala.Double
  
  type GLsizei = scala.Double
  
  type GLsizeiptr = scala.Double
  
  type GLuint = scala.Double
  
  type GLuint64 = scala.Double
  
  type GamepadHapticActuatorType = dom.std.stdStrings.vibration
  
  type HashAlgorithmIdentifier = dom.std.AlgorithmIdentifier
  
  type HeadersInit = dom.std.Headers | js.Array[js.Array[java.lang.String]] | (dom.std.Record[java.lang.String, java.lang.String])
  
  type IDBKeyPath = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - dom.std.Date
    - dom.std.BufferSource
    - dom.std.IDBArrayKey
  */
  type IDBValidKey = dom.std._IDBValidKey | scala.Double | java.lang.String
  
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  
  type Int32List = dom.std.Int32Array | js.Array[dom.std.GLint]
  
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[dom.std.IntersectionObserverEntry], 
    /* observer */ dom.std.IntersectionObserver, 
    scala.Unit
  ]
  
  type LineAndPositionSetting = scala.Double | dom.std.AutoKeyword
  
  /**
    * Convert string literal type to lowercase
    */
  type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  type MSCredentialType = dom.std.stdStrings.FIDO_2_0
  
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  
  type MediaStreamTrackAudioSourceNode = dom.std.AudioNode
  
  /* Rewritten from type alias, can be one of: 
    - dom.std.WindowProxy
    - dom.std.MessagePort
    - dom.std.ServiceWorker
  */
  type MessageEventSource = dom.std._MessageEventSource | dom.std.WindowProxy
  
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ dom.std.TypedPropertyDescriptor[js.Any], 
    dom.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  
  /** @deprecated */
  type MouseWheelEvent = dom.std.WheelEvent
  
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[dom.std.MutationRecord], 
    /* observer */ dom.std.MutationObserver, 
    scala.Unit
  ]
  
  type NamedCurve = java.lang.String
  
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ dom.std.MediaStreamError, scala.Unit]
  
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ dom.std.MediaStream, scala.Unit]
  
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  
  type NotificationPermissionCallback = js.Function1[/* permission */ dom.std.NotificationPermission, scala.Unit]
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = dom.std.Pick[T, dom.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  
  type OnBeforeUnloadEventHandler = dom.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ dom.std.Event, java.lang.String | scala.Null]
  
  type OnErrorEventHandler = dom.std.OnErrorEventHandlerNonNull | scala.Null
  
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ dom.std.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[dom.std.Error], 
    js.Any
  ]
  
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ js.Any, js.Any] */] = js.Any
  
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ dom.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type PaymentRequestUpdateEventInit = dom.std.EventInit
  
  type PerformanceEntryList = js.Array[dom.std.PerformanceEntry]
  
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = dom.std.PerformanceEntry
  
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = dom.std.PerformanceEntry
  
  type PerformanceObserverCallback = js.Function2[
    /* entries */ dom.std.PerformanceObserverEntryList, 
    /* observer */ dom.std.PerformanceObserver, 
    scala.Unit
  ]
  
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ dom.std.stdStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  
  type PositionCallback = js.Function1[/* position */ dom.std.GeolocationPosition, scala.Unit]
  
  type PositionErrorCallback = js.Function1[/* positionError */ dom.std.GeolocationPositionError, scala.Unit]
  
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.Object | js.Thenable[js.Object], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[dom.std.PropertyDescriptor]
  
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  
  type PublicKeyCredentialType = dom.std.stdStrings.`public-key`
  
  type QueuingStrategySize[T] = js.Function1[/* chunk */ T, scala.Double]
  
  type RTCAnswerOptions = dom.std.RTCOfferAnswerOptions
  
  type RTCIceCredentialType = dom.std.stdStrings.password
  
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ dom.std.DOMException, scala.Unit]
  
  type RTCRtcpMuxPolicy = dom.std.stdStrings.require
  
  type RTCRtpReceiveParameters = dom.std.RTCRtpParameters
  
  type RTCSessionDescriptionCallback = js.Function1[/* description */ dom.std.RTCSessionDescriptionInit, scala.Unit]
  
  type RTCStatsCallback = js.Function1[/* report */ dom.std.RTCStatsReport, scala.Unit]
  
  type RangeError = dom.std.Error
  
  type ReadableStreamController[T] = dom.std.ReadableStreamDefaultController[T]
  
  type ReadableStreamReader[T] = dom.std.ReadableStreamDefaultReader[T]
  
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ dom.std.stdStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: /* keyof any */ java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ReferenceError = dom.std.Error
  
  type RequestInfo = dom.std.Request | java.lang.String
  
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ dom.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[dom.std.ResizeObserverEntry], 
    /* observer */ dom.std.ResizeObserver, 
    scala.Unit
  ]
  
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, js.Any] */] = js.Any
  
  type SVGMatrix = dom.std.DOMMatrix
  
  type SVGPathSegClosePath = dom.std.SVGPathSeg
  
  type SVGPoint = dom.std.DOMPoint
  
  type SVGRect = dom.std.DOMRect
  
  type StaticRange = dom.std.AbstractRange
  
  type SyntaxError = dom.std.Error
  
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  
  type TimerHandler = java.lang.String | js.Function
  
  type TransformerFlushCallback[O] = js.Function1[
    /* controller */ dom.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TransformerStartCallback[O] = js.Function1[
    /* controller */ dom.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TransformerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ dom.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type TypeError = dom.std.Error
  
  type URIError = dom.std.Error
  
  type Uint32List = dom.std.Uint32Array | js.Array[dom.std.GLuint]
  
  /**
    * Convert first character of string literal type to lowercase
    */
  type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSinkStartCallback = js.Function1[
    /* controller */ dom.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSinkWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ dom.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  
  type UnderlyingSourcePullCallback[R] = js.Function1[
    /* controller */ dom.std.ReadableStreamController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type UnderlyingSourceStartCallback[R] = js.Function1[
    /* controller */ dom.std.ReadableStreamController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  /**
    * Convert string literal type to uppercase
    */
  type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ js.Any
  
  type UvmEntries = js.Array[dom.std.UvmEntry]
  
  type UvmEntry = js.Array[scala.Double]
  
  type VibratePattern = scala.Double | js.Array[scala.Double]
  
  type VoidFunction = js.Function0[scala.Unit]
  
  type WebKitCSSMatrix = dom.std.DOMMatrix
  
  type WindowProxy = dom.std.Window
  
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = dom.std.XPathEvaluatorBase
  
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | dom.std.anon.LookupNamespaceURI
  
  type webkitURL = dom.std.URL
}
