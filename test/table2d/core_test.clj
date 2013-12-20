(ns table2d.core-test
  (:require [clojure.test :refer :all]
            [table2d.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= [[nil 0 1]] 
           (read-row "##")))
    (is (= [[1 0 2]]
           (read-row "#1#")))
    (is (= [[:a 0 6]]
           (read-row "# :a  #")))
    (is (= [[:a 0 5] [:b 5 10] [:c 10 15]]
           (read-row "# :a # :b # :c #")))
))
