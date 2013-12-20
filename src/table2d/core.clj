(ns table2d.core
  (:require [clojure.string :refer [split]]))

(defn read-exp [s]
  (read-string (str s " nil")))

(defn read-row
  ""
  [row]
  (let [split-row (split row #"#" -1)]
    (map read-exp
     (subvec split-row 1 (- (count split-row) 1))
    )))
