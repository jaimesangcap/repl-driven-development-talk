(ns com.iggroup.wt.testservice.core-test
  (:require [com.iggroup.wt.testservice.core :as core]
            [com.iggroup.wt.testservice.db :as db])
  (:use
    [clojure.test :only [deftest]]
    [midje.sweet]))


(deftest wls
  (fact "just editables"
        (comment (let [wls ,]
                   (db/parse-wls wls) => ["yeah"]))))