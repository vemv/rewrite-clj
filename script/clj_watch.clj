#!/usr/bin/env bb

(ns clj-watch
  (:require [helper.env :as env]
            [helper.shell :as shell]
            [helper.status :as status]))

(defn -main []
  (env/assert-min-versions)
  (status/line :info "launching kaocha watch on clojure sources")
  (shell/command (concat ["clojure" "-M:test-common:kaocha" "--watch"] *command-line-args*)))

(env/when-invoked-as-script
 (-main))
