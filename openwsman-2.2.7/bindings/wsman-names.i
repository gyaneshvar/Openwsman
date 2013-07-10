/*
 * wsman-names.i
 * constant definitions for openwsman swig bindings
 *
 */

%include "wsman-names.h"

/* redefine enums here, these aren't recognized as constants by swig */

#define FLAG_NONE                            0x0000
#define FLAG_ENUMERATION_COUNT_ESTIMATION    0x0001
#define FLAG_ENUMERATION_OPTIMIZATION        0x0002
#define FLAG_ENUMERATION_ENUM_EPR            0x0004
#define FLAG_ENUMERATION_ENUM_OBJ_AND_EPR    0x0008
#define FLAG_DUMP_REQUEST                    0x0010
#define FLAG_INCLUDESUBCLASSPROPERTIES       0x0020
#define FLAG_EXCLUDESUBCLASSPROPERTIES       0x0040
#define FLAG_POLYMORPHISM_NONE               0x0080
#define FLAG_MUND_MAX_ESIZE                  0x0100
#define FLAG_MUND_LOCALE                     0x0200
#define FLAG_MUND_OPTIONSET                  0x0400
#define FLAG_MUND_FRAGMENT                   0x0800
#define FLAG_CIM_EXTENSIONS                  0x1000
#define FLAG_CIM_REFERENCES                  0x2000
#define FLAG_CIM_ASSOCIATORS                 0x4000
#define FLAG_EVENT_SENDBOOKMARK		     0X8000
#define FLAG_CIM_SCHEMA_OPT		    0X10000

#define	WSMAN_DELIVERY_PUSH         0
#define WSMAN_DELIVERY_PUSHWITHACK  1
#define WSMAN_DELIVERY_EVENTS       2
#define WSMAN_DELIVERY_PULL         3

#define WS_NO_AUTH            0
#define WS_BASIC_AUTH         1
#define WS_DIGEST_AUTH        2
#define WS_PASS_AUTH          3
#define WS_NTLM_AUTH          4
#define WS_GSSNEGOTIATE_AUTH  5
#define WS_MAX_AUTH           6
			