/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkUnixCompress {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkUnixCompress(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkUnixCompress obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkUnixCompress(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkUnixCompress() {
    this(chilkatJNI.new_CkUnixCompress(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkUnixCompress_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkUnixCompress_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkUnixCompress_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkUnixCompress_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_AbortCurrent() {
    return chilkatJNI.CkUnixCompress_get_AbortCurrent(swigCPtr, this);
  }

  public void put_AbortCurrent(boolean newVal) {
    chilkatJNI.CkUnixCompress_put_AbortCurrent(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkUnixCompress_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkUnixCompress_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkUnixCompress_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkUnixCompress_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkUnixCompress_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkUnixCompress_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkUnixCompress_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkUnixCompress_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkUnixCompress_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkUnixCompress_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkUnixCompress_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkUnixCompress_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkUnixCompress_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkUnixCompress_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkUnixCompress_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkUnixCompress_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkUnixCompress_version(swigCPtr, this);
  }

  public boolean CompressFile(String inFilename, String destPath) {
    return chilkatJNI.CkUnixCompress_CompressFile(swigCPtr, this, inFilename, destPath);
  }

  public CkTask CompressFileAsync(String inFilename, String destPath) {
    long cPtr = chilkatJNI.CkUnixCompress_CompressFileAsync(swigCPtr, this, inFilename, destPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressFileToMem(String inFilename, CkByteData outData) {
    return chilkatJNI.CkUnixCompress_CompressFileToMem(swigCPtr, this, inFilename, CkByteData.getCPtr(outData), outData);
  }

  public CkTask CompressFileToMemAsync(String inFilename) {
    long cPtr = chilkatJNI.CkUnixCompress_CompressFileToMemAsync(swigCPtr, this, inFilename);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressMemory(CkByteData inData, CkByteData outData) {
    return chilkatJNI.CkUnixCompress_CompressMemory(swigCPtr, this, CkByteData.getCPtr(inData), inData, CkByteData.getCPtr(outData), outData);
  }

  public boolean CompressMemToFile(CkByteData inData, String destPath) {
    return chilkatJNI.CkUnixCompress_CompressMemToFile(swigCPtr, this, CkByteData.getCPtr(inData), inData, destPath);
  }

  public boolean CompressString(String inStr, String charset, CkByteData outBytes) {
    return chilkatJNI.CkUnixCompress_CompressString(swigCPtr, this, inStr, charset, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean CompressStringToFile(String inStr, String charset, String destPath) {
    return chilkatJNI.CkUnixCompress_CompressStringToFile(swigCPtr, this, inStr, charset, destPath);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkUnixCompress_IsUnlocked(swigCPtr, this);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkUnixCompress_SaveLastError(swigCPtr, this, path);
  }

  public boolean UncompressFile(String inFilename, String destPath) {
    return chilkatJNI.CkUnixCompress_UncompressFile(swigCPtr, this, inFilename, destPath);
  }

  public CkTask UncompressFileAsync(String inFilename, String destPath) {
    long cPtr = chilkatJNI.CkUnixCompress_UncompressFileAsync(swigCPtr, this, inFilename, destPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UncompressFileToMem(String inFilename, CkByteData outData) {
    return chilkatJNI.CkUnixCompress_UncompressFileToMem(swigCPtr, this, inFilename, CkByteData.getCPtr(outData), outData);
  }

  public CkTask UncompressFileToMemAsync(String inFilename) {
    long cPtr = chilkatJNI.CkUnixCompress_UncompressFileToMemAsync(swigCPtr, this, inFilename);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UncompressFileToString(String zFilename, String charset, CkString outStr) {
    return chilkatJNI.CkUnixCompress_UncompressFileToString(swigCPtr, this, zFilename, charset, CkString.getCPtr(outStr), outStr);
  }

  public String uncompressFileToString(String zFilename, String charset) {
    return chilkatJNI.CkUnixCompress_uncompressFileToString(swigCPtr, this, zFilename, charset);
  }

  public CkTask UncompressFileToStringAsync(String zFilename, String charset) {
    long cPtr = chilkatJNI.CkUnixCompress_UncompressFileToStringAsync(swigCPtr, this, zFilename, charset);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UncompressMemory(CkByteData inData, CkByteData outData) {
    return chilkatJNI.CkUnixCompress_UncompressMemory(swigCPtr, this, CkByteData.getCPtr(inData), inData, CkByteData.getCPtr(outData), outData);
  }

  public boolean UncompressMemToFile(CkByteData inData, String destPath) {
    return chilkatJNI.CkUnixCompress_UncompressMemToFile(swigCPtr, this, CkByteData.getCPtr(inData), inData, destPath);
  }

  public boolean UncompressString(CkByteData inCompressedData, String charset, CkString outStr) {
    return chilkatJNI.CkUnixCompress_UncompressString(swigCPtr, this, CkByteData.getCPtr(inCompressedData), inCompressedData, charset, CkString.getCPtr(outStr), outStr);
  }

  public String uncompressString(CkByteData inCompressedData, String charset) {
    return chilkatJNI.CkUnixCompress_uncompressString(swigCPtr, this, CkByteData.getCPtr(inCompressedData), inCompressedData, charset);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkUnixCompress_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UnTarZ(String zFilename, String destDir, boolean bNoAbsolute) {
    return chilkatJNI.CkUnixCompress_UnTarZ(swigCPtr, this, zFilename, destDir, bNoAbsolute);
  }

  public CkTask UnTarZAsync(String zFilename, String destDir, boolean bNoAbsolute) {
    long cPtr = chilkatJNI.CkUnixCompress_UnTarZAsync(swigCPtr, this, zFilename, destDir, bNoAbsolute);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

}
