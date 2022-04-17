(ns first-project.core
  (:gen-class))

(use 'first-project.step)

(defn -main
  [& args]
  (loop [x 1]
    (when (< x 10000)
    (println x)
    (recur (step x)))))
  
