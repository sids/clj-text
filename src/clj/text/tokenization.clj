(ns clj.text.tokenization
  (:use clj.text.utils)
  (:require clj.text.tokenization.very-simple
            clj.text.tokenization.simple)
  (:use [clojure.contrib.def :only (defvar)]))

(defvar *tokenizer* 'clj.text.tokenization.simple)

(defn tokenize [s]
  (call *tokenizer* 'tokenize [s]))
