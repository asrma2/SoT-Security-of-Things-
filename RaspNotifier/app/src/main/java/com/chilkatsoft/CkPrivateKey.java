/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkPrivateKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkPrivateKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkPrivateKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkPrivateKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkPrivateKey() {
    this(chilkatJNI.new_CkPrivateKey(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkPrivateKey_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkPrivateKey_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkPrivateKey_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public int get_BitLength() {
    return chilkatJNI.CkPrivateKey_get_BitLength(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkPrivateKey_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkPrivateKey_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkPrivateKey_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_KeyType(CkString str) {
    chilkatJNI.CkPrivateKey_get_KeyType(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String keyType() {
    return chilkatJNI.CkPrivateKey_keyType(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkPrivateKey_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkPrivateKey_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkPrivateKey_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkPrivateKey_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkPrivateKey_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkPrivateKey_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkPrivateKey_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkPrivateKey_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_Pkcs8EncryptAlg(CkString str) {
    chilkatJNI.CkPrivateKey_get_Pkcs8EncryptAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pkcs8EncryptAlg() {
    return chilkatJNI.CkPrivateKey_pkcs8EncryptAlg(swigCPtr, this);
  }

  public void put_Pkcs8EncryptAlg(String newVal) {
    chilkatJNI.CkPrivateKey_put_Pkcs8EncryptAlg(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkPrivateKey_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkPrivateKey_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkPrivateKey_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkPrivateKey_version(swigCPtr, this);
  }

  public boolean GetJwk(CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetJwk(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getJwk() {
    return chilkatJNI.CkPrivateKey_getJwk(swigCPtr, this);
  }

  public String jwk() {
    return chilkatJNI.CkPrivateKey_jwk(swigCPtr, this);
  }

  public boolean GetJwkThumbprint(String hashAlg, CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetJwkThumbprint(swigCPtr, this, hashAlg, CkString.getCPtr(outStr), outStr);
  }

  public String getJwkThumbprint(String hashAlg) {
    return chilkatJNI.CkPrivateKey_getJwkThumbprint(swigCPtr, this, hashAlg);
  }

  public String jwkThumbprint(String hashAlg) {
    return chilkatJNI.CkPrivateKey_jwkThumbprint(swigCPtr, this, hashAlg);
  }

  public boolean GetPkcs1(CkByteData outBytes) {
    return chilkatJNI.CkPrivateKey_GetPkcs1(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetPkcs1ENC(String encoding, CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs1ENC(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs1ENC(String encoding) {
    return chilkatJNI.CkPrivateKey_getPkcs1ENC(swigCPtr, this, encoding);
  }

  public String pkcs1ENC(String encoding) {
    return chilkatJNI.CkPrivateKey_pkcs1ENC(swigCPtr, this, encoding);
  }

  public boolean GetPkcs1Pem(CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs1Pem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs1Pem() {
    return chilkatJNI.CkPrivateKey_getPkcs1Pem(swigCPtr, this);
  }

  public String pkcs1Pem() {
    return chilkatJNI.CkPrivateKey_pkcs1Pem(swigCPtr, this);
  }

  public boolean GetPkcs8(CkByteData outData) {
    return chilkatJNI.CkPrivateKey_GetPkcs8(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public boolean GetPkcs8ENC(String encoding, CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs8ENC(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs8ENC(String encoding) {
    return chilkatJNI.CkPrivateKey_getPkcs8ENC(swigCPtr, this, encoding);
  }

  public String pkcs8ENC(String encoding) {
    return chilkatJNI.CkPrivateKey_pkcs8ENC(swigCPtr, this, encoding);
  }

  public boolean GetPkcs8Encrypted(String password, CkByteData outBytes) {
    return chilkatJNI.CkPrivateKey_GetPkcs8Encrypted(swigCPtr, this, password, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetPkcs8EncryptedENC(String encoding, String password, CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs8EncryptedENC(swigCPtr, this, encoding, password, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs8EncryptedENC(String encoding, String password) {
    return chilkatJNI.CkPrivateKey_getPkcs8EncryptedENC(swigCPtr, this, encoding, password);
  }

  public String pkcs8EncryptedENC(String encoding, String password) {
    return chilkatJNI.CkPrivateKey_pkcs8EncryptedENC(swigCPtr, this, encoding, password);
  }

  public boolean GetPkcs8EncryptedPem(String password, CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs8EncryptedPem(swigCPtr, this, password, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs8EncryptedPem(String password) {
    return chilkatJNI.CkPrivateKey_getPkcs8EncryptedPem(swigCPtr, this, password);
  }

  public String pkcs8EncryptedPem(String password) {
    return chilkatJNI.CkPrivateKey_pkcs8EncryptedPem(swigCPtr, this, password);
  }

  public boolean GetPkcs8Pem(CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetPkcs8Pem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getPkcs8Pem() {
    return chilkatJNI.CkPrivateKey_getPkcs8Pem(swigCPtr, this);
  }

  public String pkcs8Pem() {
    return chilkatJNI.CkPrivateKey_pkcs8Pem(swigCPtr, this);
  }

  public CkPublicKey GetPublicKey() {
    long cPtr = chilkatJNI.CkPrivateKey_GetPublicKey(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPublicKey(cPtr, true);
  }

  public boolean GetRsaDer(CkByteData outData) {
    return chilkatJNI.CkPrivateKey_GetRsaDer(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public boolean GetRsaPem(CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetRsaPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getRsaPem() {
    return chilkatJNI.CkPrivateKey_getRsaPem(swigCPtr, this);
  }

  public String rsaPem() {
    return chilkatJNI.CkPrivateKey_rsaPem(swigCPtr, this);
  }

  public boolean GetXml(CkString outStr) {
    return chilkatJNI.CkPrivateKey_GetXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getXml() {
    return chilkatJNI.CkPrivateKey_getXml(swigCPtr, this);
  }

  public String xml() {
    return chilkatJNI.CkPrivateKey_xml(swigCPtr, this);
  }

  public boolean LoadEncryptedPem(String pemStr, String password) {
    return chilkatJNI.CkPrivateKey_LoadEncryptedPem(swigCPtr, this, pemStr, password);
  }

  public boolean LoadEncryptedPemFile(String path, String password) {
    return chilkatJNI.CkPrivateKey_LoadEncryptedPemFile(swigCPtr, this, path, password);
  }

  public boolean LoadJwk(String jsonStr) {
    return chilkatJNI.CkPrivateKey_LoadJwk(swigCPtr, this, jsonStr);
  }

  public boolean LoadPem(String str) {
    return chilkatJNI.CkPrivateKey_LoadPem(swigCPtr, this, str);
  }

  public boolean LoadPemFile(String path) {
    return chilkatJNI.CkPrivateKey_LoadPemFile(swigCPtr, this, path);
  }

  public boolean LoadPkcs1(CkByteData data) {
    return chilkatJNI.CkPrivateKey_LoadPkcs1(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean LoadPkcs1File(String path) {
    return chilkatJNI.CkPrivateKey_LoadPkcs1File(swigCPtr, this, path);
  }

  public boolean LoadPkcs8(CkByteData data) {
    return chilkatJNI.CkPrivateKey_LoadPkcs8(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean LoadPkcs8Encrypted(CkByteData data, String password) {
    return chilkatJNI.CkPrivateKey_LoadPkcs8Encrypted(swigCPtr, this, CkByteData.getCPtr(data), data, password);
  }

  public boolean LoadPkcs8EncryptedFile(String path, String password) {
    return chilkatJNI.CkPrivateKey_LoadPkcs8EncryptedFile(swigCPtr, this, path, password);
  }

  public boolean LoadPkcs8File(String path) {
    return chilkatJNI.CkPrivateKey_LoadPkcs8File(swigCPtr, this, path);
  }

  public boolean LoadRsaDer(CkByteData data) {
    return chilkatJNI.CkPrivateKey_LoadRsaDer(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean LoadRsaDerFile(String path) {
    return chilkatJNI.CkPrivateKey_LoadRsaDerFile(swigCPtr, this, path);
  }

  public boolean LoadXml(String xml) {
    return chilkatJNI.CkPrivateKey_LoadXml(swigCPtr, this, xml);
  }

  public boolean LoadXmlFile(String path) {
    return chilkatJNI.CkPrivateKey_LoadXmlFile(swigCPtr, this, path);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkPrivateKey_SaveLastError(swigCPtr, this, path);
  }

  public boolean SavePemFile(String path) {
    return chilkatJNI.CkPrivateKey_SavePemFile(swigCPtr, this, path);
  }

  public boolean SavePkcs1File(String path) {
    return chilkatJNI.CkPrivateKey_SavePkcs1File(swigCPtr, this, path);
  }

  public boolean SavePkcs8EncryptedFile(String password, String path) {
    return chilkatJNI.CkPrivateKey_SavePkcs8EncryptedFile(swigCPtr, this, password, path);
  }

  public boolean SavePkcs8EncryptedPemFile(String password, String path) {
    return chilkatJNI.CkPrivateKey_SavePkcs8EncryptedPemFile(swigCPtr, this, password, path);
  }

  public boolean SavePkcs8File(String path) {
    return chilkatJNI.CkPrivateKey_SavePkcs8File(swigCPtr, this, path);
  }

  public boolean SavePkcs8PemFile(String path) {
    return chilkatJNI.CkPrivateKey_SavePkcs8PemFile(swigCPtr, this, path);
  }

  public boolean SaveRsaDerFile(String path) {
    return chilkatJNI.CkPrivateKey_SaveRsaDerFile(swigCPtr, this, path);
  }

  public boolean SaveRsaPemFile(String path) {
    return chilkatJNI.CkPrivateKey_SaveRsaPemFile(swigCPtr, this, path);
  }

  public boolean SaveXmlFile(String path) {
    return chilkatJNI.CkPrivateKey_SaveXmlFile(swigCPtr, this, path);
  }

}