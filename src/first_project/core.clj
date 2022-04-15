(ns first-project.core
  (:gen-class))

(defn -main
  [& args]
  (defn step ([x] (+ 10 (* 2 x))))
  (loop [x 1]
    (when (< x 10000)
    (println x)
    (recur (step x)))))
  
