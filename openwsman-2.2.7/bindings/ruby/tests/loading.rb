# test loading of extension
require 'test/unit'


class LoadTest < Test::Unit::TestCase
  def test_loading
    require '_loadpath'
    require 'openwsman'
    assert true
  end
end

