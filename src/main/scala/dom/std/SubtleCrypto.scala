package dom.std

import dom.std.stdStrings.jwk
import dom.std.stdStrings.pkcs8
import dom.std.stdStrings.raw
import dom.std.stdStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto). */
@js.native
trait SubtleCrypto extends StObject {
  
  def decrypt(
    algorithm: AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Promise[ArrayBuffer] = js.native
  
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: ConcatParams, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: DhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: EcdhKeyDeriveParams, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  def deriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey, length: Double): js.Promise[ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: ConcatParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: DhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: EcdhKeyDeriveParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def deriveKey(
    algorithm: Pbkdf2Params,
    baseKey: CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  def digest(algorithm: AlgorithmIdentifier, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: DataView): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Float32Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Float64Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Int16Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Int32Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Int8Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Uint16Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Uint32Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Uint8Array): js.Promise[ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: Uint8ClampedArray): js.Promise[ArrayBuffer] = js.native
  
  def encrypt(
    algorithm: AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    key: CryptoKey,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Promise[ArrayBuffer] = js.native
  
  def exportKey(format: java.lang.String, key: CryptoKey): js.Promise[JsonWebKey | ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): js.Promise[JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: CryptoKey): js.Promise[ArrayBuffer] = js.native
  
  def generateKey(algorithm: AesKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  def generateKey(algorithm: AlgorithmIdentifier, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair | CryptoKey] = js.native
  def generateKey(algorithm: DhKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: EcKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  def generateKey(algorithm: HmacKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  def generateKey(algorithm: Pbkdf2Params, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKey] = js.native
  def generateKey(algorithm: RsaHashedKeyGenParams, extractable: scala.Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[CryptoKeyPair] = js.native
  
  def importKey(
    format: raw | pkcs8 | spki,
    keyData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams | AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: JsonWebKey | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    algorithm: AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams | AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: DataView): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Float32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Float64Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Int8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: Uint8ClampedArray): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: DataView): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Float32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Float64Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Int16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Int32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Int8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Uint16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Uint32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Uint8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: AlgorithmIdentifier, key: CryptoKey, data: Uint8ClampedArray): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: DataView): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Float32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Float64Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Int8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: Uint8ClampedArray): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: ArrayBuffer): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: DataView): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Float32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Float64Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Int8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint16Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint32Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint8Array): js.Promise[ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: Uint8ClampedArray): js.Promise[ArrayBuffer] = js.native
  
  def unwrapKey(
    format: raw | pkcs8 | spki | jwk | java.lang.String,
    wrappedKey: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesCmacParams | AesGcmParams | AesCfbParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | DhImportKeyParams | AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[KeyUsage]
  ): js.Promise[CryptoKey] = js.native
  
  def verify(
    algorithm: AlgorithmIdentifier | RsaPssParams | EcdsaParams | AesCmacParams,
    key: CryptoKey,
    signature: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer,
    data: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): js.Promise[scala.Boolean] = js.native
  
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCfbParams): js.Promise[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCmacParams): js.Promise[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: CryptoKey,
    wrappingKey: CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[ArrayBuffer] = js.native
  def wrapKey(format: java.lang.String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCfbParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCmacParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(format: jwk, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCfbParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCmacParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(format: pkcs8, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCfbParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCmacParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(format: raw, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCbcParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCfbParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCmacParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesCtrParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AesGcmParams): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: AlgorithmIdentifier): js.Promise[ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(format: spki, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: RsaOaepParams): js.Promise[ArrayBuffer] = js.native
}
