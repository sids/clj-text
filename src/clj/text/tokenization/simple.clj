(ns clj.text.tokenization.simple
  (:use [clojure.contrib.def :only (defvar)]))

(defvar *token-re* #"\w+")

(defn tokenize [s]
  (re-seq *token-re* (.toLowerCase s)))
