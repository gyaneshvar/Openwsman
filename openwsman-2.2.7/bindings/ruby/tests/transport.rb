# transport.rb

require 'test/unit'
require '_loadpath'
require 'openwsman'
require '_client'

class WsmanTest < Test::Unit::TestCase
  def test_transport
    client = Client.open
    assert client
    transport = client.transport

    assert transport.auth_method?( Openwsman::BASIC_AUTH )

    assert Openwsman::Transport.auth_name( Openwsman::NO_AUTH ) == Openwsman::NO_AUTH_STR
    assert Openwsman::Transport.auth_name( Openwsman::BASIC_AUTH ) == Openwsman::BASIC_AUTH_STR
    assert Openwsman::Transport.auth_name( Openwsman::DIGEST_AUTH ) == Openwsman::DIGEST_AUTH_STR
    assert Openwsman::Transport.auth_name( Openwsman::PASS_AUTH ) == Openwsman::PASS_AUTH_STR
    assert Openwsman::Transport.auth_name( Openwsman::NTLM_AUTH ) == Openwsman::NTLM_AUTH_STR
    assert Openwsman::Transport.auth_name( Openwsman::GSSNEGOTIATE_AUTH ) == Openwsman::GSSNEGOTIATE_AUTH_STR
    
    assert transport.agent = "agent"
    assert transport.agent == "agent"

    assert transport.auth_method = Openwsman::DIGEST_AUTH_STR
    assert transport.auth_method == Openwsman::Transport.auth_name( Openwsman::DIGEST_AUTH )
    assert transport.auth_value == Openwsman::DIGEST_AUTH

    assert Openwsman::Transport.error_string(0)

    assert transport.timeout = 42
    assert transport.timeout == 42

    assert transport.verify_peer = 42
    assert transport.verify_peer == 42

    assert transport.verify_host = 42
    assert transport.verify_host == 42

    assert transport.proxy = "proxy"
    assert transport.proxy == "proxy"

    assert transport.proxyauth = "proxy_auth"
    assert transport.proxyauth == "proxy_auth"

    assert transport.cainfo = "cainfo"
    assert transport.cainfo == "cainfo"

    assert transport.capath = "capath"
    assert transport.capath == "capath"

    assert transport.caoid = "caoid"
    assert transport.caoid == "caoid"

    assert transport.cert = "cert"
    assert transport.cert == "cert"

    assert transport.key = "key"
    assert transport.key == "key"

  end
end

