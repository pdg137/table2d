(ns table2d.core-test
  (:require [clojure.test :refer :all]
            [table2d.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= [nil] 
           (read-row "##")))
    (is (= [1]
           (read-row "#1#")))

))
