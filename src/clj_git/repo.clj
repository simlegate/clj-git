(ns clj-git.repo
  (:gen-class))

(defn init
  [path]
  (println (str "path of Git repo " path)))
