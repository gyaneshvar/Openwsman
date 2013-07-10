# test identify action

$: << File.dirname(__FILE__)
require 'test/unit'
require '_loadpath'
require 'openwsman'
require 'auth-callback'
require '_client'

class IdentifyTest < Test::Unit::TestCase
  def test_identify
    Openwsman::debug = 1
    
    client = Client.open
    assert client
    client.transport.auth_method = Openwsman::BASIC_AUTH_STR
    options = Openwsman::ClientOptions.new
    assert options
    options.set_dump_request

    doc = client.identify( options )
    assert doc
    puts "Error!" if doc.fault?
    root = doc.root
    assert root
    
#    print root
#
# root.find is the 'clumsy' way
#    prot_version = root.find( Openwsman::XML_NS_WSMAN_ID, "ProtocolVersion" )
#    prod_vendor = root.find( Openwsman::XML_NS_WSMAN_ID, "ProductVendor" )
#    prod_version = root.find( Openwsman::XML_NS_WSMAN_ID, "ProductVersion" )
    
    # Ruby allows to catch 'method_missing' making it much more elegant:
    prot_version = root.ProtocolVersion
    prod_vendor = root.ProductVendor
    prod_version = root.ProductVersion

    puts "\tProtocol #{prot_version}\n\tVendor #{prod_vendor}\n\tVersion #{prod_version}"
    
  end
end

