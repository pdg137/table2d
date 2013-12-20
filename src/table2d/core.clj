(ns table2d.core
  (:require [clojure.string :refer [split]]))

(defn read-exp [s]
  (read-string (str s " nil")))

(defn read-exp-list [l]
  (map read-exp l))

(defn remove-first-and-last [l]
  (subvec l 1 (- (count l) 1)))

(defn col-count [l]
  (reduce (fn [x y] (conj x (+ 1 (last x) (count y)))) [0] l))

(defn read-row
  ""
  [row]
  (let [exp-list (remove-first-and-last (split row #"#" -1))]
    (map vector 
         (read-exp-list exp-list)
         (subvec (col-count exp-list) 0 (count exp-list))
         (rest (col-count exp-list))
     )
))
