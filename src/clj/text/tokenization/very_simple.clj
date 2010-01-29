(ns clj.text.tokenization.very-simple
  (:use [clojure.contrib.def :only (defvar)]))

(defvar *token-re* #"\w+")

(defn tokenize [s]
  (re-seq *token-re* s))
