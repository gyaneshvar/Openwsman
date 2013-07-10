/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openwsman;

public class OpenWSMan implements OpenWSManConstants {
  public static int wsman_send_request(Client cl, XmlDoc request) {
    return OpenWSManJNI.wsman_send_request(Client.getCPtr(cl), cl, XmlDoc.getCPtr(request), request);
  }

  public static void wsmc_transport_set_auth_request_func(Client cl, SWIGTYPE_p_wsman_auth_request_func_t f) {
    OpenWSManJNI.wsmc_transport_set_auth_request_func(Client.getCPtr(cl), cl, SWIGTYPE_p_wsman_auth_request_func_t.getCPtr(f));
  }

  public static int wsman_is_auth_method(Client cl, int method) {
    return OpenWSManJNI.wsman_is_auth_method(Client.getCPtr(cl), cl, method);
  }

  public static int wsmc_transport_init(Client cl, SWIGTYPE_p_void arg) {
    return OpenWSManJNI.wsmc_transport_init(Client.getCPtr(cl), cl, SWIGTYPE_p_void.getCPtr(arg));
  }

  public static void wsman_transport_close_transport(Client cl) {
    OpenWSManJNI.wsman_transport_close_transport(Client.getCPtr(cl), cl);
  }

  public static void wsmc_transport_fini(Client cl) {
    OpenWSManJNI.wsmc_transport_fini(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_agent(Client cl, String agent) {
    OpenWSManJNI.wsman_transport_set_agent(Client.getCPtr(cl), cl, agent);
  }

  public static String wsman_transport_get_agent(Client cl) {
    return OpenWSManJNI.wsman_transport_get_agent(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_userName(Client cl, String user_name) {
    OpenWSManJNI.wsman_transport_set_userName(Client.getCPtr(cl), cl, user_name);
  }

  public static void wsman_transport_set_password(Client cl, String password) {
    OpenWSManJNI.wsman_transport_set_password(Client.getCPtr(cl), cl, password);
  }

  public static void wsman_transport_set_proxy_username(Client cl, String proxy_username) {
    OpenWSManJNI.wsman_transport_set_proxy_username(Client.getCPtr(cl), cl, proxy_username);
  }

  public static void wsman_transport_set_proxy_password(Client cl, String proxy_password) {
    OpenWSManJNI.wsman_transport_set_proxy_password(Client.getCPtr(cl), cl, proxy_password);
  }

  public static void wsman_transport_set_auth_method(Client cl, String am) {
    OpenWSManJNI.wsman_transport_set_auth_method(Client.getCPtr(cl), cl, am);
  }

  public static String wsman_transport_get_auth_method(Client cl) {
    return OpenWSManJNI.wsman_transport_get_auth_method(Client.getCPtr(cl), cl);
  }

  public static String wsmc_transport_get_auth_name(SWIGTYPE_p_wsman_auth_type_t auth) {
    return OpenWSManJNI.wsmc_transport_get_auth_name(SWIGTYPE_p_wsman_auth_type_t.getCPtr(auth));
  }

  public static SWIGTYPE_p_wsman_auth_type_t wsmc_transport_get_auth_value(Client cl) {
    return new SWIGTYPE_p_wsman_auth_type_t(OpenWSManJNI.wsmc_transport_get_auth_value(Client.getCPtr(cl), cl), true);
  }

  public static String wsman_transport_get_last_error_string(SWIGTYPE_p_WS_LASTERR_Code err) {
    return OpenWSManJNI.wsman_transport_get_last_error_string(SWIGTYPE_p_WS_LASTERR_Code.getCPtr(err));
  }

  public static void wsman_transport_set_timeout(Client cl, long timeout) {
    OpenWSManJNI.wsman_transport_set_timeout(Client.getCPtr(cl), cl, timeout);
  }

  public static long wsman_transport_get_timeout(Client cl) {
    return OpenWSManJNI.wsman_transport_get_timeout(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_verify_peer(Client cl, long value) {
    OpenWSManJNI.wsman_transport_set_verify_peer(Client.getCPtr(cl), cl, value);
  }

  public static long wsman_transport_get_verify_peer(Client cl) {
    return OpenWSManJNI.wsman_transport_get_verify_peer(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_verify_host(Client cl, long value) {
    OpenWSManJNI.wsman_transport_set_verify_host(Client.getCPtr(cl), cl, value);
  }

  public static long wsman_transport_get_verify_host(Client cl) {
    return OpenWSManJNI.wsman_transport_get_verify_host(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_crlcheck(Client cl, long value) {
    OpenWSManJNI.wsman_transport_set_crlcheck(Client.getCPtr(cl), cl, value);
  }

  public static long wsman_transport_get_crlcheck(Client cl) {
    return OpenWSManJNI.wsman_transport_get_crlcheck(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_crlfile(Client cl, String arg) {
    OpenWSManJNI.wsman_transport_set_crlfile(Client.getCPtr(cl), cl, arg);
  }

  public static String wsman_transport_get_crlfile(Client cl) {
    return OpenWSManJNI.wsman_transport_get_crlfile(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_proxy(Client cl, String proxy) {
    OpenWSManJNI.wsman_transport_set_proxy(Client.getCPtr(cl), cl, proxy);
  }

  public static String wsman_transport_get_proxy(Client cl) {
    return OpenWSManJNI.wsman_transport_get_proxy(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_proxyauth(Client cl, String pauth) {
    OpenWSManJNI.wsman_transport_set_proxyauth(Client.getCPtr(cl), cl, pauth);
  }

  public static String wsman_transport_get_proxyauth(Client cl) {
    return OpenWSManJNI.wsman_transport_get_proxyauth(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_cainfo(Client cl, String cainfo) {
    OpenWSManJNI.wsman_transport_set_cainfo(Client.getCPtr(cl), cl, cainfo);
  }

  public static String wsman_transport_get_cainfo(Client cl) {
    return OpenWSManJNI.wsman_transport_get_cainfo(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_certhumbprint(Client cl, String arg) {
    OpenWSManJNI.wsman_transport_set_certhumbprint(Client.getCPtr(cl), cl, arg);
  }

  public static String wsman_transport_get_certhumbprint(Client cl) {
    return OpenWSManJNI.wsman_transport_get_certhumbprint(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_capath(Client cl, String capath) {
    OpenWSManJNI.wsman_transport_set_capath(Client.getCPtr(cl), cl, capath);
  }

  public static String wsman_transport_get_capath(Client cl) {
    return OpenWSManJNI.wsman_transport_get_capath(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_caoid(Client cl, String oid) {
    OpenWSManJNI.wsman_transport_set_caoid(Client.getCPtr(cl), cl, oid);
  }

  public static String wsman_transport_get_caoid(Client cl) {
    return OpenWSManJNI.wsman_transport_get_caoid(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_cert(Client cl, String cert) {
    OpenWSManJNI.wsman_transport_set_cert(Client.getCPtr(cl), cl, cert);
  }

  public static String wsman_transport_get_cert(Client cl) {
    return OpenWSManJNI.wsman_transport_get_cert(Client.getCPtr(cl), cl);
  }

  public static void wsman_transport_set_key(Client cl, String key) {
    OpenWSManJNI.wsman_transport_set_key(Client.getCPtr(cl), cl, key);
  }

  public static String wsman_transport_get_key(Client cl) {
    return OpenWSManJNI.wsman_transport_get_key(Client.getCPtr(cl), cl);
  }

  public static void set_debug(int dbg) {
    OpenWSManJNI.set_debug(dbg);
  }

  public static int get_debug() {
    return OpenWSManJNI.get_debug();
  }

  public static XmlDoc create_soap_envelope() {
    long cPtr = OpenWSManJNI.create_soap_envelope();
    return (cPtr == 0) ? null : new XmlDoc(cPtr, false);
  }

}
