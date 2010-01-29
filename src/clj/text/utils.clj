(ns clj.text.utils)

(defmacro call
  "Macro that expands to a call to function f in the given namespace."
  ([ns f]
     `(call ns f []))
  ([ns f args]
     `(apply (ns-resolve (the-ns (symbol ~ns)) ~f) ~args)))
